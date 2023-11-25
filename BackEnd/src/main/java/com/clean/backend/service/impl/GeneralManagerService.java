package com.clean.backend.service.impl;

import com.clean.backend.service.IVGeneralManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.clean.backend.entity.ApiResponse;
import com.clean.backend.dao.GeneralManagerDao;

@Service
public class GeneralManagerService implements IVGeneralManagerService {
    @Autowired
    GeneralManagerDao generalManagerDao;

    @Override
    public String agreeApplication(int id) {
        ApiResponse<String> apiResponse = new ApiResponse<>();
        generalManagerDao.manageApplication(id,21);
        generalManagerDao.newmanage(id,-1);
        return apiResponse.success("已同意申请");
    }

    @Override
    public String refuseApplication(int id) {
        ApiResponse<String> apiResponse = new ApiResponse<>();
        generalManagerDao.manageApplication(id,20);
        return apiResponse.success("已拒绝申请");
    }
}
