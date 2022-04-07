package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.entity.Users;
import com.itheima.mapper.UsersMapper;
import com.itheima.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImp implements UsersService {

    @Autowired
    private Users users;

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users find(Users users) {
        Users users1 = (Users) usersMapper.find(users);
        return users1;
    }

    @Override
    public List<Users> findAll(int pagenum,int pagesize,String sort,String value) {
        PageHelper.startPage(pagenum,pagesize);
        //System.out.println(value);
        List<Users> users = usersMapper.findAll(sort,value);
        return users;
    }

    @Override
    public void updatepwd(Users users) {
        if (users.getId() == null){
            usersMapper.insert(users);
            return;
        }
        usersMapper.updateByPrimaryKeySelective(users);
    }

    @Override
    public void del(Long id) {
        usersMapper.deleteByPrimaryKey(id);
    }


}
