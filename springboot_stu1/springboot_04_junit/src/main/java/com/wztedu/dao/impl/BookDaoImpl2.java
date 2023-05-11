package com.wztedu.dao.impl;

import com.wztedu.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl2 implements BookDao {
    @Override
    public void save() {
        System.out.println("bookDao is running...22222");
    }
}
