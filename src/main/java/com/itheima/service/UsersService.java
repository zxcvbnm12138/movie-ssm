package com.itheima.service;


import com.itheima.entity.Users;

import java.util.List;

public interface UsersService {

    public Users find(Users users);

    public List<Users> findAll(int pagenum,int pagesize,String sort,String value);

    void updatepwd(Users users);

    void del(Long id);
}
