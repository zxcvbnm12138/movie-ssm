package com.itheima.mapper;

import com.itheima.entity.Fangyingting;
import com.itheima.entity.Shangpinfenlei;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShangpinfenleiMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Shangpinfenlei record);

    int insertSelective(Shangpinfenlei record);

    Shangpinfenlei selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Shangpinfenlei record);

    int updateByPrimaryKey(Shangpinfenlei record);

    List<Shangpinfenlei> findAll(@Param(value = "sort")String sort,@Param(value = "value")String value);

    List<Shangpinfenlei> spflfindAll();
}