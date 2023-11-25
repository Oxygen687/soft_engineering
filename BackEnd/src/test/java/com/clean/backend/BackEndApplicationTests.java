package com.clean.backend;


import com.clean.backend.entity.Application;
import com.clean.backend.entity.NormalVisitor;
import com.clean.backend.entity.Visit;
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

    @Test
    void contextLoads() {
        System.out.println(administratorService.getMyApproval(1));
    }

    @Test
    void zgs(){
//        visitorDao.insertVisitor("岗欢羊子",0,10);
//        NormalVisitor normalVisitor = new NormalVisitor(1,"岗欢羊子","苏州牛马大学","21111111","沪A66888","平江悦");
//        normalVisitorDao.insertinfo(normalVisitor);

        //Visit visit = new Visit(2,4,"岗欢羊子",2,"平江悦","2023-12-10",-1);
        //normalVisitorDao.insertvisit(visit);
        //Application application = new Application(3,4,"岗欢羊子",2,"平江悦",1,0);
        //normalVisitorDao.insertapplication(application);
//        administratorService.agreeApplication(4);
//        administratorService.refuseApplication(1);
        //administratorService.startVisit(4);
        administratorService.finishVisit(4);
    }

    @Test
    void zzgss(){
        TemDriver temDriver = new TemDriver(1,"岗欢羊","苏州科技大学","11111111","沪A66688",2);
        System.out.println(temDriverDao.selectSurvey());

    }
}
