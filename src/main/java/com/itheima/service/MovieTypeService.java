package com.itheima.service;

import com.itheima.entity.Dianyingleixing;
import com.itheima.entity.Yonghu;

import java.util.List;

public interface MovieTypeService {

    List<Dianyingleixing> findAll(int pagenum, int pagesize, String sort,String value);

    void update(Dianyingleixing dianyingleixing);

    void del(Long id);

    List<Dianyingleixing> mtfindAll();

}
