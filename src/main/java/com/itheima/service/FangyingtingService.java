package com.itheima.service;

import com.itheima.entity.Dianyingleixing;
import com.itheima.entity.Fangyingting;

import java.util.List;

public interface FangyingtingService {

    List<Fangyingting> findAll(int pagenum, int pagesize, String sort,String value);

    void update(Fangyingting fangyingting);

    void del(Long id);

    List<Fangyingting> fytfindAll();
}
