package com.itheima.mapper;

import com.itheima.entity.Dianyingleixing;
import com.itheima.entity.Fangyingting;
import com.itheima.entity.Yonghu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DianyingleixingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Dianyingleixing record);

    int insertSelective(Dianyingleixing record);

    Dianyingleixing selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dianyingleixing record);

    int updateByPrimaryKey(Dianyingleixing record);

    List<Dianyingleixing> findAll(@Param(value = "sort")String sort,@Param(value = "value")String value);

    List<Dianyingleixing> mtfindAll();
}