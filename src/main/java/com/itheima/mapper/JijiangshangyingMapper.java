package com.itheima.mapper;

import com.itheima.entity.Jijiangshangying;
import com.itheima.entity.Reyingdianying;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JijiangshangyingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Jijiangshangying record);

    int insertSelective(Jijiangshangying record);

    Jijiangshangying selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Jijiangshangying record);

    int updateByPrimaryKey(Jijiangshangying record);

    List<Jijiangshangying> findAll(@Param(value = "sort")String sort,@Param(value = "value")String value);

}