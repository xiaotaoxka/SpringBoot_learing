package com.wztedu;

import com.wztedu.dao.AccountDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class Springboot05MybatisApplicationTests {

    @Autowired
    private AccountDao accountDao;

    @Test
    void contextLoads() {
        System.out.println(accountDao.getById(1));
    }

}
