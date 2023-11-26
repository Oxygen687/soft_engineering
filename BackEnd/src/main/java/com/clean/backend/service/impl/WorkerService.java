package com.clean.backend.service.impl;

import com.clean.backend.dao.VisitorDao;
import com.clean.backend.dao.WorkerDao;
import com.clean.backend.entity.*;
import com.clean.backend.service.IVWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService implements IVWorkerService {
    @Autowired
    WorkerDao workerDao;
    @Autowired
    VisitorDao visitorDao;
    @Override
    public String getMyapplication(String name) {
        ApiResponse<Application> apiResponse = new ApiResponse<>();
        Application application = workerDao.getMyApplication(name);
        if(application==null){
            System.out.println("查无此人");
            return apiResponse.fail("查无此人，请重新申请");
        }
        return apiResponse.success(application);
    }

    @Override
    public String insertMyapplication(Worker worker, Visit visit, Application application) {
        ApiResponse<String> apiResponse = new ApiResponse<>();
        workerDao.insertinfo(worker);
        workerDao.insertApplication(application);
        workerDao.insertvisit(visit);
        visitorDao.insertVisitor(worker.getName(), 1, visitorDao.selectWorkerId(worker.getName()));
        return apiResponse.success("插入信息成功");
    }

    @Override
    public String insertAnswer(String name,String answer1, String answer2) {
        ApiResponse<String> apiResponse = new ApiResponse<>();
        workerDao.insertAnswer(answer1,answer2,name);
        return apiResponse.success("填写成功！");
    }

    @Override
    public String getQuestion() {
        ApiResponse<List<Question>> apiResponse = new ApiResponse<>();
        List<Question> list = workerDao.getQuestion();
        return apiResponse.success(list);
    }
}
