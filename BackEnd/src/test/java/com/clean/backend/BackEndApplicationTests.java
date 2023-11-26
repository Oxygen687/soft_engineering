package com.clean.backend;


import com.clean.backend.entity.Application;
import com.clean.backend.entity.Visit;
import com.clean.backend.controller.AdministratorController;
import com.clean.backend.entity.*;
import com.clean.backend.service.impl.*;
import com.clean.backend.service.impl.normalVisitorService;
import com.clean.backend.service.impl.GeneralApartmentService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.clean.backend.dao.*;
import com.clean.backend.dao.AdministratorDao;
import com.clean.backend.dao.VisitorDao;

@SpringBootTest
class BackEndApplicationTests {
    @Autowired
    VisitorDao visitorDao;
    @Autowired
    AdministratorDao administratorDao;
    @Autowired
    normalVisitorDao normalVisitorDao;
    @Autowired
    AdministratorService administratorService;
    @Autowired
    normalVisitorService normalVisitorService;

    @Autowired
    GeneralApartmentDao generalApartmentDao;

    @Autowired
    GeneralManagerDao generalManagerDao;
    @Autowired
    GeneralManagerService generalManagerService;
    @Autowired
    GeneralApartmentService generalApartmentService;
    @Autowired
    TemDriverService temDriverService;
    @Autowired
    TemDriverDao temDriverDao;
    @Autowired
    AdministratorController administratorController;
    @Autowired
    WorkerService workerService;
    @Autowired
    WorkerDao workerDao;
    @Test
    void zgs(){
        System.out.println(workerService.getQuestion());
    }

    @Test
    void zzgss(){
        Worker worker = new Worker(1,"大兵","苏州牛马大学","11334466","沪B7777","平江悦","33333333");
        Visit visit = new Visit(1,"大兵","平江悦","wzj");
        Application application = new Application(1,"大兵","平江悦","wzj");
        workerService.insertMyapplication(worker,visit,application);

    }
}
