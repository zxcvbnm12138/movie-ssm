package com.itheima.service;

import com.itheima.entity.Reyingdianying;

import java.util.List;


public interface ReyingdianyingService {

    List<Reyingdianying> findAll(int pagenum, int pagesize, String sort,String value);

    void update(Reyingdianying reyingdianying);

    void del(Long id);

}
