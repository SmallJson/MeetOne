package com.bupt.meetone.mapper;

import com.bupt.meetone.model.health.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
//没有业务意义，测试mybatis连接数据库是否成立
@Repository
public interface HealthMapper {
    @Select("select * from account")
    public List<Account> getAll();
}
