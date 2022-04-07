package com.itheima.mapper;

import com.itheima.entity.Shangpingoumai;
import com.itheima.entity.Shangpinxinxi;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShangpingoumaiMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Shangpingoumai record);

    int insertSelective(Shangpingoumai record);

    Shangpingoumai selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Shangpingoumai record);

    int updateByPrimaryKey(Shangpingoumai record);

    List<Shangpingoumai> findAll(@Param(value = "sort")String sort,@Param(value = "value")String value);
}