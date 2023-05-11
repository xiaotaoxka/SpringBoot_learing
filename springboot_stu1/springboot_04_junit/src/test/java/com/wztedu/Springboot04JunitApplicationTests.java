package com.wztedu;

import com.wztedu.dao.BookDao;
import com.wztedu.dao.impl.BookDaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04JunitApplicationTests {

    // 1. 注入你要测试的对象
    @Autowired
    private BookDao bookDao;


    @Test
    void contextLoads() {
        // 2. 执行要测试的对象对应的方法
        bookDao.save();
    }

}
