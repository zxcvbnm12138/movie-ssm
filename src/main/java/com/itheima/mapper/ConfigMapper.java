package com.itheima.mapper;

import com.itheima.entity.Config;
import com.itheima.entity.Shangpingoumai;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Config record);

    int insertSelective(Config record);

    Config selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Config record);

    int updateByPrimaryKey(Config record);

    List<Config> findAll(@Param(value = "sort")String sort);
}