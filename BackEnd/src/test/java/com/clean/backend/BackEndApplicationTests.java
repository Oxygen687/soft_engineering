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
        System.out.println(administratorController.selectVIP()
        );
    }

    @Test
    void clean(){
        Application application = new Application();
        application.setName("zgs");
        application.setVisitApartment("丽春苑");
        normalVisitorDao.insertapplication(application);
    }
}
