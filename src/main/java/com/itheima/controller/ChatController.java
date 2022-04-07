package com.itheima.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.entity.Chat;
import com.itheima.entity.Users;
import com.itheima.service.ChatService;
import com.itheima.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    ChatService chatService;

    @ResponseBody
    @RequestMapping(value = "/chatinfo",method = RequestMethod.GET)
    public Map getchatfo(){

        List<Chat> list = chatService.findAll();
        PageInfo<Chat> chatPageInfo = new PageInfo<Chat>(list);

        Map map = new HashMap();
        map.put("total",chatPageInfo.getTotal());
        map.put("list",list);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/updatechat",method = RequestMethod.POST)
    public Result Updatechat(@RequestBody Chat chat){
//        System.out.println(chat.getId());
        chatService.update(chat);
        chatService.updateadminms(chat);
        Result result = new Result(200,"回复信息成功");
        return result;
    }

}
