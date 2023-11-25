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
    public String insertTemDriver(TemDriver temDriver,int ans1,int ans2,int ans3,int ans4,int ans5) {
        ApiResponse<String> apiResponse = new ApiResponse<>();
        temDriverDao.insertTemDriver(temDriver);
        if(ans1 == 1 & ans2 == 0 & ans3 == 1 & ans4 == 1 & ans5 == 0){
            temDriverDao.successInsert(temDriverDao.selectByName(temDriver.getDriverName()),1);
            return apiResponse.success("申请成功！");
        }
        else {
            return apiResponse.fail("答题错误，无法预约，请重新答题！");
        }
    }

}
