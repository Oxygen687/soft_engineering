package com.clean.backend.service.impl;

import com.clean.backend.dao.TemDriverDao;
import com.clean.backend.entity.ApiResponse;
import com.clean.backend.entity.*;
import com.clean.backend.service.IVTemDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemDriverService implements IVTemDriverService {
    @Autowired
    TemDriverDao temDriverDao;
    @Override
    public String insertTemDriver(TemDriver temDriver) {
        ApiResponse<String> apiResponse = new ApiResponse<>();
        temDriverDao.insertTemDriver(temDriver);
        return apiResponse.success("申请成功！");
    }


}
