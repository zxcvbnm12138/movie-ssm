package com.itheima.service;

import com.itheima.entity.Config;
import com.itheima.entity.Shangpingoumai;

import java.util.List;

public interface ConfigService {
    List<Config> findAll(int pagenum, int pagesize, String sort);

    void update(Config config);

    void del(Long id);
}
