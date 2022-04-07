package com.itheima.service.impl;

import com.itheima.entity.Chat;
import com.itheima.mapper.ChatMapper;
import com.itheima.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImp implements ChatService {

    @Autowired
    private ChatMapper chatMapper;

    @Override
    public List<Chat> findAll() {
        List<Chat> chatList = chatMapper.findAll();
        return chatList;

    }

    @Override
    public void update(Chat chat) {
        chatMapper.updateusermessage(chat);

    }

    @Override
    public void updateadminms(Chat chat) {
        chatMapper.insertadminms(chat);
    }
}
