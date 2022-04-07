package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.entity.Config;
import com.itheima.entity.Shangpingoumai;
import com.itheima.mapper.ConfigMapper;
import com.itheima.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigServiceImp implements ConfigService {

    @Autowired
    private ConfigMapper configMapper;

    @Override
    public List<Config> findAll(int pagenum, int pagesize, String sort) {
        PageHelper.startPage(pagenum,pagesize);
        //System.out.println(sort);
        List<Config> configList = configMapper.findAll(sort);
        return configList;
    }

    @Override
    public void update(Config config) {
        configMapper.updateByPrimaryKey(config);

    }

    @Override
    public void del(Long id) {
        configMapper.deleteByPrimaryKey(id);

    }
}
