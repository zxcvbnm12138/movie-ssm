package com.itheima.service;

import com.itheima.entity.Chat;
import com.itheima.entity.Users;

import java.util.List;

public interface ChatService {

    public List<Chat> findAll();

    void update(Chat chat);

    void updateadminms(Chat chat);
}
