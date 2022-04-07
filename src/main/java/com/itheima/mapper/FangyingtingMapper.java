package com.itheima.mapper;

import com.itheima.entity.Dianyingleixing;
import com.itheima.entity.Fangyingting;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FangyingtingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Fangyingting record);

    int insertSelective(Fangyingting record);

    Fangyingting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Fangyingting record);

    int updateByPrimaryKey(Fangyingting record);

    List<Fangyingting> findAll(@Param(value = "sort")String sort,@Param(value = "value")String value);

    List<Fangyingting> fytfindAll();
}