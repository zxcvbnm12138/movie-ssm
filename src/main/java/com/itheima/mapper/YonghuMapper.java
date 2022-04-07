package com.itheima.mapper;

import com.itheima.entity.Yonghu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YonghuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Yonghu record);

    int insertSelective(Yonghu record);

    Yonghu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Yonghu record);

    int updateByPrimaryKey(Yonghu record);

    List<Yonghu> findAll(@Param(value = "sort")String sort,@Param(value = "value")String value);


}