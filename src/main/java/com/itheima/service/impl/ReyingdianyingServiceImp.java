package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.entity.Reyingdianying;
import com.itheima.mapper.ReyingdianyingMapper;
import com.itheima.service.ReyingdianyingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReyingdianyingServiceImp implements ReyingdianyingService {

    @Autowired
    private ReyingdianyingMapper reyingdianyingMapper;

    @Override
    public List<Reyingdianying> findAll(int pagenum, int pagesize, String sort,String value) {

        PageHelper.startPage(pagenum,pagesize);
        //System.out.println(sort);
        List<Reyingdianying> reyingdianyingList = reyingdianyingMapper.findAll(sort,value);
        return reyingdianyingList;

    }

    @Override
    public void update(Reyingdianying reyingdianying) {
        if (reyingdianying.getId() == null){
            reyingdianyingMapper.insert(reyingdianying);
            return;
        }
        reyingdianyingMapper.updateByPrimaryKey(reyingdianying);
    }

    @Override
    public void del(Long id) {
        reyingdianyingMapper.deleteByPrimaryKey(id);

    }
}
