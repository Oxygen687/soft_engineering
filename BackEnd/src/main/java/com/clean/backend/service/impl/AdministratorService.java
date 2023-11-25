package com.clean.backend.service.impl;

import com.clean.backend.entity.Application;
import com.clean.backend.entity.Visitor;
import com.clean.backend.service.IVAdministratorService;
import com.clean.backend.dao.AdministratorDao;
import com.clean.backend.entity.ApiResponse;
import com.clean.backend.entity.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorService implements IVAdministratorService {
    @Autowired
    AdministratorDao administratorDao;

    @Override
    public String agreeApplication(int visitorId) {
        ApiResponse<String> apiResponse = new ApiResponse();
        administratorDao.agreeAppliaction(visitorId,1);
        return apiResponse.success("操作成功，已同意申请");
    }

    @Override
    public String refuseApplication(int visitorId) {
        ApiResponse<String> apiResponse = new ApiResponse();
        administratorDao.agreeAppliaction(visitorId,-1);
        return apiResponse.fail("操作成功，已拒绝申请");
    }

    @Override
    public String getMyApproval(int id) {
        ApiResponse<List<Application>> apiResponse = new ApiResponse<>();
        List<Application> list = administratorDao.getMyApproval(id);
        if(list == null){
            System.out.println("您当前还没有待审批的申请！");
            return apiResponse.fail("暂无待审批申请！");
        }
        return apiResponse.success(list);

    }
    @Override
    public String startVisit(int id) {
        ApiResponse<String> apiResponse = new ApiResponse();
        administratorDao.manageVisit(id,0);
        return apiResponse.success("访客已开始！");
    }

    @Override
    public String finishVisit(int id) {
        ApiResponse<String> apiResponse = new ApiResponse();
        administratorDao.manageVisit(id,1);
        return apiResponse.success("访客已结束！");

    }

    @Override
    public String startVIPVisit(int id) {
        int VIPStatue = administratorDao.selectVIPStatue(id);
        ApiResponse<String> apiResponse = new ApiResponse<>();
        //活动开始之前检查是否审核通过
        if(VIPStatue == 21){
            administratorDao.manageVIP(id,0);
            return apiResponse.success("访问已开始！");
        }
        else {
            return apiResponse.fail("请等待审核！");
        }
    }

    @Override
    public String finishVIPVisitor(int id) {
        ApiResponse<String> apiResponse = new ApiResponse<>();
        administratorDao.manageVIP(id,1);
        return apiResponse.success("访问结束！");
    }

    @Override
    public String login(String administratorName, int password) {
        ApiResponse<Administrator> apiResponse = new ApiResponse<>();
        Administrator administrator = administratorDao.getByaccount(administratorName);
        if(administrator == null){
            return apiResponse.fail("账号不存在！");
        }
        if(password != administrator.getPassword()){
            return apiResponse.fail("密码错误");
        }
        System.out.println("ok");
        return apiResponse.success(administrator);
    }
}

