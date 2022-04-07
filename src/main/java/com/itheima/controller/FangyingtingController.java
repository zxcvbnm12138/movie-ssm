package com.itheima.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.entity.Dianyingleixing;
import com.itheima.entity.Fangyingting;
import com.itheima.service.FangyingtingService;
import com.itheima.service.MovieTypeService;
import com.itheima.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
@RequestMapping("/fangyingting")
public class FangyingtingController {

    @Autowired
    private FangyingtingService fangyingtingService;

    @ResponseBody
    @RequestMapping(value = "/fytAll",method = RequestMethod.GET)
    public List getfangyingtingAll(){

        List<Fangyingting> list = fangyingtingService.fytfindAll();

        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/fyt",method = RequestMethod.GET)
    public Map getfangyingting(@RequestParam(value = "page")int pagenum, @RequestParam(value = "limit")int pagesize, @RequestParam(value = "sort")String sort,@RequestParam(value = "value") String value){

        if (Objects.equals(sort, "+id")){
            sort = "ASC";
        }else {
            sort = "DESC";
        }

        List<Fangyingting> list = fangyingtingService.findAll(pagenum,pagesize,sort,value);
        PageInfo<Fangyingting> fangyingtingPageInfo = new PageInfo<Fangyingting>(list);

        Map map = new HashMap();
        map.put("total",fangyingtingPageInfo.getTotal());
        map.put("list",list);
        return map;
    }


    @ResponseBody
    @RequestMapping(value = "/updatefyt",method = RequestMethod.POST)
    public Result updatefytinfo(@RequestBody Fangyingting fangyingting){
        //System.out.println(yonghu.getTouxiang());
        fangyingtingService.update(fangyingting);
        Result result = new Result(200,"放映厅更新成功");
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/del",method = RequestMethod.POST)
    public Result Del(@RequestBody String id){
        Long newid = Long.parseLong(id.replace("=",""));

        fangyingtingService.del(newid);
        Result result = new Result(200,"放映厅删除成功");
        return result;
    }

}
