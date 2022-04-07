package com.itheima.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.pagehelper.PageInfo;
import com.itheima.entity.Users;
import com.itheima.service.UsersService;
import com.itheima.utils.Result;
import com.itheima.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


@Controller
@RequestMapping("/admin")
public class UsersController {

    @Autowired
    private Users users;

    @Autowired
    private UsersService usersService;

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestBody Users users) throws JsonProcessingException {
        Result result = null;
        Users users1 = usersService.find(users);
        String username = users.getUsername();
        String password = users.getPassword();
        Map map = new HashMap();
        String json;

        if (users1 != null){
            Object token = TokenUtils.token(username,password);

            map.put("token",token);
            result = new Result(20000,map);

            json = JSONObject.toJSONString(result);
        }else {
            String msg="'账号密码错误！'";
            result = new Result(50000,msg);
           json = JSONObject.toJSONString(result);
        }
        return json;
    }

    @ResponseBody
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public Map getadmininfo(@RequestParam(value = "page")int pagenum,@RequestParam(value = "limit")int pagesize,@RequestParam(value = "sort")String sort,@RequestParam(value = "value") String value){

        if (Objects.equals(sort, "+id")){
            sort = "ASC";
        }else {
            sort = "DESC";
        }
        //System.out.println(value == "");
        List<Users> list = usersService.findAll(pagenum,pagesize,sort,value);
        PageInfo<Users> usersPageInfo = new PageInfo<Users>(list);

        //System.out.println(usersPageInfo.getPages());
        Map map = new HashMap();
        map.put("total",usersPageInfo.getTotal());
        map.put("list",list);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/updatepwd",method = RequestMethod.POST)
    public Result  Updatepwd(@RequestBody Users users){
//        System.out.println(users.getId());
        usersService.updatepwd(users);
        Result result = null;
        result = new Result(20000,"更新成功");
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/del",method = RequestMethod.POST)
    public Result  Del(@RequestBody String id){
        Long newid = Long.parseLong(id.replace("=",""));
        usersService.del(newid);
        Result result = null;
        result = new Result(20000,"删除成功");
        return result;
    }

}

