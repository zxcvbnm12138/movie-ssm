package com.itheima.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.entity.Reyingdianying;
import com.itheima.service.ReyingdianyingService;
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
@RequestMapping("/reyingdianying")
public class ReyingdianyingController {

    @Autowired
    private ReyingdianyingService reyingdianyingService;

    @ResponseBody
    @RequestMapping(value = "/rydyinfo",method = RequestMethod.GET)
    public Map getreyingdianyinginfo(@RequestParam(value = "page")int pagenum, @RequestParam(value = "limit")int pagesize, @RequestParam(value = "sort")String sort,@RequestParam(value = "value") String value){

        if (Objects.equals(sort, "+id")){
            sort = "ASC";
        }else {
            sort = "DESC";
        }
        //System.out.println(sort);
        List<Reyingdianying> list = reyingdianyingService.findAll(pagenum,pagesize,sort,value);
        PageInfo<Reyingdianying> reyingdianyingPageInfo = new PageInfo<Reyingdianying>(list);

        //System.out.println(usersPageInfo.getPages());
        Map map = new HashMap();
        map.put("total",reyingdianyingPageInfo.getTotal());
        map.put("list",list);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/updaterydy",method = RequestMethod.POST)
    public Result updaterydy(@RequestBody Reyingdianying reyingdianying){
        //System.out.println(yonghu.getTouxiang());
        reyingdianyingService.update(reyingdianying);
        Result result = new Result(200,"热映电影更新成功");
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/updatehm",method = RequestMethod.POST)
    public String updatehm(HttpServletRequest request, @RequestParam("file") MultipartFile file) throws IOException {


        String filename = file.getOriginalFilename();
        System.out.println("要上传的原始的文件名是:"+filename);

        String fileKuozhanming = filename.substring(filename.lastIndexOf("."));
       System.out.println("要上传的文件的扩展名:"+fileKuozhanming);

        String newFileName= request.getParameter("uid")+fileKuozhanming;
       System.out.println("生成一个新的永远不重复的文件名："+newFileName);

        String realPath=request.getServletContext().getRealPath("\\upload")+"\\"+newFileName;
//       String realPath="D:\\GC\\movie-ssm\\src\\main\\webapp\\upload\\"+newFileName;
        System.out.println("上传的地址是:"+realPath);

        file.transferTo(new File(realPath));
       System.out.println("文件上传成功~~~");
        String str = "upload/"+newFileName;
        return str;
    }

    @ResponseBody
    @RequestMapping(value = "/del",method = RequestMethod.POST)
    public Result Del(@RequestBody String id){
        Long newid = Long.parseLong(id.replace("=",""));

        reyingdianyingService.del(newid);
        Result result = new Result(200,"热映电影删除成功");
        return result;
    }

}
