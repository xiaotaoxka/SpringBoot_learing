package com.wztedu;

import com.wztedu.dao.AccountDao;
import com.wztedu.domain.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot06MybatisPlusApplicationTests {

    @Autowired
    private AccountDao accountDao;

    @Test
    void contextLoads() {
        System.out.println(accountDao.selectById(2));
    }

    @Test
    void testGetAll() {
        List<Account> accounts = accountDao.selectList(null);
        System.out.println(accounts);
    }

}
