package com.itheima.service;

import com.itheima.entity.Shangpingoumai;
import com.itheima.entity.Shangpinxinxi;

import java.util.List;

public interface ShangpingoumaiService {

    List<Shangpingoumai> findAll(int pagenum, int pagesize, String sort,String value);

    void update(Shangpingoumai shangpingoumai);

    void del(Long id);
}
