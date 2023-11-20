package com.clean.backend.service.impl;

import com.clean.backend.dao.VisitorDao;
import com.clean.backend.entity.ApiResponse;
import com.clean.backend.entity.Visitor;
import com.clean.backend.service.IVisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitorService implements IVisitorService {
    @Autowired
    VisitorDao visitorDao;

    @Override
    public String getVisitorById(int id) {
        ApiResponse<Visitor> apiResponse = new ApiResponse<>();
        Visitor visitor = visitorDao.getVisitorById(id);
        if(visitor==null){
            System.out.println("查无此人");
            return apiResponse.fail("查无此人");
        }
        return apiResponse.success(visitor);
    }



}
