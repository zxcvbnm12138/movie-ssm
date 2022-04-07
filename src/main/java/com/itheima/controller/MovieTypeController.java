package com.itheima.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.entity.Dianyingleixing;
import com.itheima.entity.Fangyingting;
import com.itheima.entity.Yonghu;
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
@RequestMapping("/movietype")
public class MovieTypeController {

    @Autowired
    private Dianyingleixing dianyingleixing;

    @Autowired
    private MovieTypeService movieTypeService;

    @ResponseBody
    @RequestMapping(value = "/mtAll",method = RequestMethod.GET)
    public List getmovietypeAll(){

        List<Dianyingleixing> list = movieTypeService.mtfindAll();

        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/mt",method = RequestMethod.GET)
    public Map getmovietype(@RequestParam(value = "page")int pagenum, @RequestParam(value = "limit")int pagesize, @RequestParam(value = "sort")String sort,@RequestParam(value = "value") String value){

        if (Objects.equals(sort, "+id")){
            sort = "ASC";
        }else {
            sort = "DESC";
        }

        List<Dianyingleixing> list = movieTypeService.findAll(pagenum,pagesize,sort,value);
        PageInfo<Dianyingleixing> dianyingleixingPageInfo = new PageInfo<Dianyingleixing>(list);

        Map map = new HashMap();
        map.put("total",dianyingleixingPageInfo.getTotal());
        map.put("list",list);
        return map;
    }


    @ResponseBody
    @RequestMapping(value = "/updatemt",method = RequestMethod.POST)
    public Result updatehuinfo(@RequestBody Dianyingleixing dianyingleixing){
        //System.out.println(yonghu.getTouxiang());
        movieTypeService.update(dianyingleixing);
        Result result = new Result(200,"电影类型更新成功");
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/del",method = RequestMethod.POST)
    public Result Del(@RequestBody String id){
        Long newid = Long.parseLong(id.replace("=",""));

        movieTypeService.del(newid);
        Result result = new Result(200,"电影类型删除成功");
        return result;
    }


}
