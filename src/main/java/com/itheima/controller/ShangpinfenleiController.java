package com.itheima.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.entity.Dianyingleixing;
import com.itheima.entity.Fangyingting;
import com.itheima.entity.Shangpinfenlei;
import com.itheima.service.ShangpinfenleiService;
import com.itheima.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
@RequestMapping("/shangpinfenlei")
public class ShangpinfenleiController {

    @Autowired
    private ShangpinfenleiService shangpinfenleiService;

    @ResponseBody
    @RequestMapping(value = "/spfl",method = RequestMethod.GET)
    public Map getshangpinfenlei(@RequestParam(value = "page")int pagenum, @RequestParam(value = "limit")int pagesize, @RequestParam(value = "sort")String sort,@RequestParam(value = "value") String value){

        if (Objects.equals(sort, "+id")){
            sort = "ASC";
        }else {
            sort = "DESC";
        }

        List<Shangpinfenlei> list = shangpinfenleiService.findAll(pagenum,pagesize,sort,value);
        PageInfo<Shangpinfenlei> shangpinfenleiPageInfo = new PageInfo<Shangpinfenlei>(list);

        Map map = new HashMap();
        map.put("total",shangpinfenleiPageInfo.getTotal());
        map.put("list",list);
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/spflAll",method = RequestMethod.GET)
    public List getshangpinfenleiAll(){

        List<Shangpinfenlei> list = shangpinfenleiService.spflfindAll();

        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/updatespfl",method = RequestMethod.POST)
    public Result updatespflinfo(@RequestBody Shangpinfenlei shangpinfenlei){
        //System.out.println(yonghu.getTouxiang());
        shangpinfenleiService.update(shangpinfenlei);
        Result result = new Result(200,"放映厅更新成功");
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/del",method = RequestMethod.POST)
    public Result Del(@RequestBody String id){
        Long newid = Long.parseLong(id.replace("=",""));

        shangpinfenleiService.del(newid);
        Result result = new Result(200,"放映厅删除成功");
        return result;
    }


}
