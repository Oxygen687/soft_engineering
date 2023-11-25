package com.clean.backend;


import com.clean.backend.entity.Application;
import com.clean.backend.entity.NormalVisitor;
import com.clean.backend.entity.Visit;
import com.clean.backend.entity.Visitor;
import com.clean.backend.entity.VipVisitor;
import com.clean.backend.service.impl.AdministratorService;
import com.clean.backend.service.impl.normalVisitorService;
import com.clean.backend.service.impl.VisitorService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.clean.backend.dao.normalVisitorDao;
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
    VisitorService visitorService;
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
        System.out.println(administratorService.login("wzj",112233));
    }
}
