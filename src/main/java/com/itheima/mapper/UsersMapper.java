package com.itheima.mapper;

import com.itheima.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    Users find(Users users);

    List<Users> findAll(@Param(value = "sort")String sort,@Param(value = "value")String value);
}