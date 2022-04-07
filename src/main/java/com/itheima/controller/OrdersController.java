package com.itheima.controller;


import com.github.pagehelper.PageInfo;
import com.itheima.entity.Orders;
import com.itheima.entity.Shangpingoumai;
import com.itheima.service.OrdersService;
import com.itheima.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;


    @ResponseBody
    @RequestMapping(value = "/ywcinfo",method = RequestMethod.GET)
    public Map getordersinfo(@RequestParam(value = "page")int pagenum, @RequestParam(value = "limit")int pagesize, @RequestParam(value = "sort")String sort,@RequestParam(value = "value") String value){

        if (Objects.equals(sort, "+id")){
            sort = "ASC";
        }else {
            sort = "DESC";
        }
        //System.out.println(sort);
        List<Orders> list = ordersService.findywc(pagenum,pagesize,sort,value);
        PageInfo<Orders> ordersPageInfo = new PageInfo<Orders>(list);

        //System.out.println(usersPageInfo.getPages());
        Map map = new HashMap();
        map.put("total",ordersPageInfo.getTotal());
        map.put("list",list);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/wwcinfo",method = RequestMethod.GET)
    public Map getwwcinfo(@RequestParam(value = "page")int pagenum, @RequestParam(value = "limit")int pagesize, @RequestParam(value = "sort")String sort,@RequestParam(value = "value") String value){

        if (Objects.equals(sort, "+id")){
            sort = "ASC";
        }else {
            sort = "DESC";
        }
        //System.out.println(sort);
        List<Orders> list = ordersService.findwwc(pagenum,pagesize,sort,value);
        PageInfo<Orders> ordersPageInfo = new PageInfo<Orders>(list);

        //System.out.println(usersPageInfo.getPages());
        Map map = new HashMap();
        map.put("total",ordersPageInfo.getTotal());
        map.put("list",list);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/yqxinfo",method = RequestMethod.GET)
    public Map getyqxinfo(@RequestParam(value = "page")int pagenum, @RequestParam(value = "limit")int pagesize, @RequestParam(value = "sort")String sort,@RequestParam(value = "value") String value){

        if (Objects.equals(sort, "+id")){
            sort = "ASC";
        }else {
            sort = "DESC";
        }
        //System.out.println(sort);
        List<Orders> list = ordersService.findyqx(pagenum,pagesize,sort,value);
        PageInfo<Orders> ordersPageInfo = new PageInfo<Orders>(list);

        //System.out.println(usersPageInfo.getPages());
        Map map = new HashMap();
        map.put("total",ordersPageInfo.getTotal());
        map.put("list",list);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/updateod",method = RequestMethod.POST)
    public Result updatespgm(@RequestBody Orders orders){
        //System.out.println(yonghu.getTouxiang());
        ordersService.update(orders);
        Result result = new Result(200,"订单信息更新成功");
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/del",method = RequestMethod.POST)
    public Result Del(@RequestBody String id){
        Long newid = Long.parseLong(id.replace("=",""));

        ordersService.del(newid);
        Result result = new Result(200,"订单删除成功");
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/findTotal",method = RequestMethod.GET)
    public Map getTotal (){
        List<Orders> totalList = ordersService.findTotal();
        Map map = new HashMap();
        map.put("list",totalList);
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/findDay",method = RequestMethod.GET)
    public Map getDay (){
        List<Orders> dayList = ordersService.findDay();
        Map map = new HashMap();
        map.put("list",dayList);
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/findMonth",method = RequestMethod.GET)
    public Map getMonth (){
        List<Orders> monthList = ordersService.findMonth();
        Map map = new HashMap();
        map.put("list",monthList);
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/findYear",method = RequestMethod.GET)
    public Map getYear (){
        List<Orders> yearList = ordersService.findYear();
        Map map = new HashMap();
        map.put("list",yearList);
        return map;
    }

}
