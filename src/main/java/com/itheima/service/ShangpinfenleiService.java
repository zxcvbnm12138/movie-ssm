package com.itheima.service;

import com.itheima.entity.Fangyingting;
import com.itheima.entity.Shangpinfenlei;

import java.util.List;

public interface ShangpinfenleiService {

    List<Shangpinfenlei> findAll(int pagenum, int pagesize, String sort,String value);

    void update(Shangpinfenlei shangpinfenlei);

    void del(Long id);

    List<Shangpinfenlei> spflfindAll();
}
