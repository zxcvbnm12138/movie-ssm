package com.itheima.mapper;

import com.itheima.entity.Reyingdianying;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReyingdianyingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Reyingdianying record);

    int insertSelective(Reyingdianying record);

    Reyingdianying selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Reyingdianying record);

    int updateByPrimaryKey(Reyingdianying record);

    List<Reyingdianying> findAll(@Param(value = "sort")String sort,@Param(value = "value")String value);
}