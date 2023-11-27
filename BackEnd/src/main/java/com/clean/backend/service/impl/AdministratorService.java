package com.clean.backend.service.impl;

import com.clean.backend.entity.*;
import com.clean.backend.service.IVAdministratorService;
import com.clean.backend.dao.AdministratorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorService implements IVAdministratorService {
    @Autowired
    AdministratorDao administratorDao;

    @Override
    public String agreeApplication(String name) {
        ApiResponse<String> apiResponse = new ApiResponse();
        administratorDao.agreeAppliaction(name,1);
        return apiResponse.success("操作成功，已同意申请");
    }

    @Override
    public String refuseApplication(String name) {
        ApiResponse<String> apiResponse = new ApiResponse();
        administratorDao.agreeAppliaction(name,-1);
        return apiResponse.fail("操作成功，已拒绝申请");
    }

    @Override
    public String getMyApproval(String name) {
        ApiResponse<List<Application>> apiResponse = new ApiResponse<>();
        List<Application> list = administratorDao.getMyApproval(name);
        if(list.size() == 0){
            System.out.println("您当前还没有待审批的申请！");
            return apiResponse.fail("暂无待审批申请！");
        }
        return apiResponse.success(list);

    }
    @Override
    public String startVisit(String name) {
        ApiResponse<String> apiResponse = new ApiResponse();
        administratorDao.manageVisit(name,0);
        return apiResponse.success("访客已开始！");
    }

    @Override
    public String finishVisit(String name) {
        ApiResponse<String> apiResponse = new ApiResponse();
        administratorDao.manageVisit(name,1);
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
    public String finishVIPVisit(int id) {
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

    @Override
    public String getVisit(String visitAdministrator) {
        ApiResponse<List<Visit>> apiResponse = new ApiResponse<>();
        List<Visit> list = administratorDao.getVisit(visitAdministrator);
        return apiResponse.success(list);
    }

    @Override
    public String insertVIP(VipVisitor visitor) {
        ApiResponse<String> apiResponse = new ApiResponse<>();
        administratorDao.insertVIP(visitor);
        return apiResponse.success("添加成功");
    }

    @Override
    public String selectVIPStatue(int id) {
        ApiResponse<String> apiResponse = new ApiResponse<>();
        int flag = administratorDao.selectVIPStatue(id);
        if (flag == 0) {
            return apiResponse.success("请等待人事总务部和总经理审核");

        } else if (flag == 10) {
            return apiResponse.success("人事总务部已拒绝！");
        } else if (flag == 11) {
            return apiResponse.success("请等待总经理审核");
        } else if (flag == 20) {
            return apiResponse.success("总经理已拒绝");
        } else  {
            return apiResponse.success("审核已通过");
        }
    }

    @Override
    public String selectVIP() {
        ApiResponse<List<VipVisitor>> apiResponse = new ApiResponse<>();
        List<VipVisitor> list = administratorDao.selectVIP();
        return apiResponse.success(list);
    }
}

