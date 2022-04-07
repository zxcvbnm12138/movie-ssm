package com.itheima.mapper;

import com.itheima.entity.Orders;
import com.itheima.entity.Shangpingoumai;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    List<Orders> findywc(@Param(value = "sort")String sort,@Param(value = "value")String value);

    List<Orders> findwwc(@Param(value = "sort")String sort,@Param(value = "value")String value);

    List<Orders> findyqx(@Param(value = "sort")String sort,@Param(value = "value")String value);

    List<Orders> findtotal();
    List<Orders> findday();
    List<Orders> findmonth();
    List<Orders> findyear();

}