package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.entity.Dianyingleixing;
import com.itheima.entity.Fangyingting;
import com.itheima.mapper.DianyingleixingMapper;
import com.itheima.mapper.FangyingtingMapper;
import com.itheima.service.FangyingtingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FangyingtingServiceImp implements FangyingtingService {

    @Autowired
    private FangyingtingMapper fangyingtingMapper;

    @Override
    public List<Fangyingting> findAll(int pagenum, int pagesize, String sort,String value) {
        PageHelper.startPage(pagenum,pagesize);

        List<Fangyingting> fangyingtingList = fangyingtingMapper.findAll(sort,value);
        return fangyingtingList;
    }

    @Override
    public void update(Fangyingting fangyingting) {
        if (fangyingting.getId() == null){
            fangyingtingMapper.insert(fangyingting);
            return;
        }
        fangyingtingMapper.updateByPrimaryKey(fangyingting);

    }

    @Override
    public void del(Long id) {
        fangyingtingMapper.deleteByPrimaryKey(id);

    }

    @Override
    public List<Fangyingting> fytfindAll() {
        List<Fangyingting> List = fangyingtingMapper.fytfindAll();

        return List;
    }
}
