package com.itheima.service;

import com.itheima.entity.Orders;
import com.itheima.entity.Shangpingoumai;

import java.util.List;

public interface OrdersService {

    List<Orders> findywc(int pagenum, int pagesize, String sort,String value);

    List<Orders> findwwc(int pagenum, int pagesize, String sort,String value);

    List<Orders> findyqx(int pagenum, int pagesize, String sort,String value);


    void update(Orders orders);

    void del(Long id);

    List<Orders> findTotal();
    List<Orders> findDay();
    List<Orders> findMonth();
    List<Orders> findYear();
}
