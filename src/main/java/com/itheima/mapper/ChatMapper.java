package com.itheima.mapper;

import com.itheima.entity.Chat;
import com.itheima.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChatMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Chat record);

    int insertSelective(Chat record);

    Chat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Chat record);

    int updateByPrimaryKey(Chat record);

    List<Chat> findAll();

    int updateusermessage(Chat record);

    int insertadminms(Chat chat);
}