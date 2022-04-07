package com.itheima.service;

import com.itheima.entity.Jijiangshangying;
import com.itheima.entity.Reyingdianying;

import java.util.List;

public interface JijiangshangyingService {

    List<Jijiangshangying> findAll(int pagenum, int pagesize, String sort,String value);

    void update(Jijiangshangying jijiangshangying);

    void del(Long id);
}
