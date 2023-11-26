package com.clean.backend.service.impl;

import com.clean.backend.entity.Application;
import com.clean.backend.entity.NormalVisitor;
import com.clean.backend.entity.VipVisitor;
import com.clean.backend.service.IVGeneralApartmentService;
import com.clean.backend.dao.GeneralApartmentDao;
import com.clean.backend.entity.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneralApartmentService implements IVGeneralApartmentService {
    @Autowired
    GeneralApartmentDao generalApartmentDao;

    @Override
    public String getApproval() {
        ApiResponse<List<VipVisitor>> apiResponse = new ApiResponse<>();
        List<VipVisitor> list = generalApartmentDao.getApproval();
        if(list.size() == 0){
            System.out.println("您当前还没有待审批的申请！");
            return apiResponse.fail("暂无待审批申请！");
        }
        return apiResponse.success(list);
    }

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
