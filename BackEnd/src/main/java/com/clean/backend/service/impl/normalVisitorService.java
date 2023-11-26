package com.clean.backend.service.impl;


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
    @Override
    public String getMyapplication(int id) {
        ApiResponse<NormalVisitor> apiResponse = new ApiResponse<>();
        NormalVisitor normalVisitor = normalVisitorDao.getMyapplication(id);
        if(normalVisitor==null){
            System.out.println("查无此人");
            return apiResponse.fail("查无此人");
        }
        return apiResponse.success(normalVisitor);
    }


    @Override
    public String insertVisitor(String name) {
        ApiResponse<String> apiResponse = new ApiResponse<>();
        visitorDao.insertVisitor(name,0, visitorDao.selectId(name));
        return apiResponse.success("插入成功！");

    }


}
