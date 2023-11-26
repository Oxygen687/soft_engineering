package com.clean.backend.service.impl;

import com.clean.backend.entity.VipVisitor;
import com.clean.backend.service.IVGeneralManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.clean.backend.entity.ApiResponse;
import com.clean.backend.dao.GeneralManagerDao;

import java.util.List;

@Service
public class GeneralManagerService implements IVGeneralManagerService {
    @Autowired
    GeneralManagerDao generalManagerDao;

    @Override
    public String agreeApplication(int id) {
        ApiResponse<String> apiResponse = new ApiResponse<>();
        generalManagerDao.manageApplication(id,21);
        generalManagerDao.newmanage(id,-1);//更改visitStatue，表示审核完成
        return apiResponse.success("已同意申请");
    }

    @Override
    public String refuseApplication(int id) {
        ApiResponse<String> apiResponse = new ApiResponse<>();
        generalManagerDao.manageApplication(id,20);
        return apiResponse.success("已拒绝申请");
    }

    @Override
    public String getApproval() {
        ApiResponse<List<VipVisitor>> apiResponse = new ApiResponse<>();
        List<VipVisitor> list = generalManagerDao.getApproval();
        if(list.size() == 0){
            System.out.println("您当前还没有待审批的申请！");
            return apiResponse.fail("暂无待审批申请！");
        }
        return apiResponse.success(list);
    }
}
