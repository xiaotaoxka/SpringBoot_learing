package com.wztedu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wztedu.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {

}
