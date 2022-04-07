package com.itheima.mapper;

import com.itheima.entity.Jijiangshangying;
import com.itheima.entity.Shangpinxinxi;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShangpinxinxiMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Shangpinxinxi record);

    int insertSelective(Shangpinxinxi record);

    Shangpinxinxi selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Shangpinxinxi record);

    int updateByPrimaryKey(Shangpinxinxi record);

    List<Shangpinxinxi> findAll(@Param(value = "sort")String sort,@Param(value = "value")String value);
}