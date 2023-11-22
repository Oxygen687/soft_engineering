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
}
