package com.wztedu.dao;

import com.wztedu.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AccountDao {

    @Select("select * from account where id = #{id}")
    Account getById(Integer id);
}
