package com.clean.backend;

import com.clean.backend.entity.Visitor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.clean.backend.dao.VisitorDao;
@SpringBootTest
class BackEndApplicationTests {

    @Autowired
    VisitorDao visitorDao;
    @Test
    void contextLoads() {
        Visitor visitor = visitorDao.getVisitorById(1);
        System.out.println(visitor.toString());
    }

}
