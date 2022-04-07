package com.itheima.service;

import com.itheima.entity.Jijiangshangying;
import com.itheima.entity.Shangpinxinxi;

import java.util.List;

public interface ShangpinxinxiService {

    List<Shangpinxinxi> findAll(int pagenum, int pagesize, String sort,String value);

    void update(Shangpinxinxi shangpinxinxi);

    void del(Long id);
}
