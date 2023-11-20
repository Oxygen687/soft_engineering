package com.clean.backend;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.clean.backend.dao.normalVisitorDao;
@SpringBootTest
class BackEndApplicationTests {

    @Autowired
    normalVisitorDao normalVisitorDao;
    @Test
    void contextLoads() {
        int res = normalVisitorDao.insertinfo("岗欢羊","苏州技师学院","111111111","沪A88888","平江悦");

    }

}
