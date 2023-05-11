package com.wztedu.dao.impl;

import com.wztedu.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository(value = "bookDao")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("bookDao is running...");
    }
}
