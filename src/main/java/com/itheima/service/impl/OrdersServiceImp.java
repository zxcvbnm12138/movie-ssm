package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.entity.Orders;
import com.itheima.entity.Shangpingoumai;
import com.itheima.mapper.OrdersMapper;
import com.itheima.mapper.ShangpingoumaiMapper;
import com.itheima.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImp implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public List<Orders> findywc(int pagenum, int pagesize, String sort,String value) {
        PageHelper.startPage(pagenum,pagesize);
        //System.out.println(sort);
        List<Orders> ordersList = ordersMapper.findywc(sort,value);
        return ordersList;
    }

    @Override
    public List<Orders> findwwc(int pagenum, int pagesize, String sort,String value) {
        PageHelper.startPage(pagenum,pagesize);
        //System.out.println(sort);
        List<Orders> ordersList = ordersMapper.findwwc(sort,value);
        return ordersList;
    }

    @Override
    public List<Orders> findyqx(int pagenum, int pagesize, String sort,String value) {
        PageHelper.startPage(pagenum,pagesize);
        System.out.println(value);
        List<Orders> ordersList = ordersMapper.findyqx(sort,value);
        return ordersList;
    }


    @Override
    public void update(Orders orders) {
        ordersMapper.updateByPrimaryKey(orders);

    }

    @Override
    public void del(Long id) {
        ordersMapper.deleteByPrimaryKey(id);

    }

    @Override
    public List<Orders> findTotal() {
        List<Orders> totalList = ordersMapper.findtotal();
        return totalList;
    }

    @Override
    public List<Orders> findDay() {
        List<Orders> dayList= ordersMapper.findday();
        return dayList;
    }

    @Override
    public List<Orders> findMonth() {
        List<Orders> monthList = ordersMapper.findmonth();
        return monthList;
    }

    @Override
    public List<Orders> findYear(String yeardata) {
        List<Orders> yearList = ordersMapper.findyear(yeardata);
        return yearList;
    }
}
