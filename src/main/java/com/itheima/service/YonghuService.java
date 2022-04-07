package com.itheima.service;

import com.itheima.entity.Yonghu;

import java.util.List;

public interface YonghuService {

    List<Yonghu> findAll(int pagenum,int pagesize,String sort,String value);

    void update(Yonghu yonghu);

    void del(Long id);
}
