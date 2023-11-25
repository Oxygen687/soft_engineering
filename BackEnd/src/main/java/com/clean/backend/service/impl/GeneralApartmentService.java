package com.clean.backend.service.impl;

import com.clean.backend.service.IVGeneralApartmentService;
import com.clean.backend.dao.GeneralApartmentDao;
import com.clean.backend.entity.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GeneralApartmentService implements IVGeneralApartmentService {
    @Autowired
    GeneralApartmentDao generalApartmentDao;

    @Override
    public String agreeApplication(int id) {
        ApiResponse<String> apiResponse = new ApiResponse<>();
        generalApartmentDao.manageApplication(id,11);
        return apiResponse.success("已同意申请");
    }

    @Override
    public String refuseApplication(int id) {
        ApiResponse<String> apiResponse = new ApiResponse<>();
        generalApartmentDao.manageApplication(id,10);
        return apiResponse
                .success("已拒绝申请");
    }
}
