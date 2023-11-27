package com.clean.backend.service.impl;


import com.clean.backend.entity.Application;
import com.clean.backend.service.IVnormalVisitorService;
import com.clean.backend.dao.normalVisitorDao;
import com.clean.backend.dao.VisitorDao;
import com.clean.backend.entity.ApiResponse;
import com.clean.backend.entity.NormalVisitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class normalVisitorService implements IVnormalVisitorService {
    @Autowired
    normalVisitorDao normalVisitorDao;

    @Autowired
    VisitorDao visitorDao;
    // 普通访客端查看我的申请
    @Override
    public String getMyapplication(String name) {
        ApiResponse<NormalVisitor> apiResponse = new ApiResponse<>();
        NormalVisitor normalVisitor = normalVisitorDao.getMyapplication(name);
        if(normalVisitor==null){
            System.out.println("查无此人");
            return apiResponse.fail("查无此人");
        }
        return apiResponse.success(normalVisitor);
    }


    // 普通访客填写信息之后调用
    @Override
    public String insertinfo(String name,
                             String company,
                             String phone,
                             String licensePlateNumber,
                             String visitApartment) {
        ApiResponse<String> apiResponse = new ApiResponse<>();
        // 封装normalVisitor信息 写入数据库 潜在危险:插入相同的人可能会报错 即使不报错 查的时候也会报错 有时间再做
        NormalVisitor normalVisitor = new NormalVisitor(name,company,phone,licensePlateNumber,visitApartment);
        normalVisitorDao.insertinfo(normalVisitor);

        // 在信息表中添加申请
        Application application = new Application();
        application.setName(name);
        application.setVisitApartment(visitApartment);
        normalVisitorDao.insertapplication(application);
        visitorDao.insertVisitor(name,0, visitorDao.selectId(name));
        return apiResponse.success("添加成功");
    }
}
