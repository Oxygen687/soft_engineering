package com.clean.backend;


import com.clean.backend.entity.Application;
import com.clean.backend.entity.NormalVisitor;
import com.clean.backend.entity.Visit;
import com.clean.backend.controller.AdministratorController;
import com.clean.backend.entity.*;
import com.clean.backend.entity.VipVisitor;
import com.clean.backend.service.impl.*;
import com.clean.backend.service.impl.normalVisitorService;
import com.clean.backend.service.impl.GeneralApartmentService;
import com.clean.backend.service.impl.VisitorService;

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

    @Test
    void zgs(){
        NormalVisitor normalVisitor = new NormalVisitor(1,"帐若要","苏州科技大学","112233","沪A8888","平江悦");
        Application application = new Application(1,"帐若要","平江悦","wzj");
        Visit visit = new Visit(1,"帐若要","平江悦","wzj");
//        normalVisitorDao.insertinfo(normalVisitor);
//        normalVisitorDao.insertapplication(application);
        normalVisitorDao.insertvisit(visit);
    }

    @Test
    void zzgss(){
        System.out.println(administratorController.getMyApproval("wzj"));


    }
}
