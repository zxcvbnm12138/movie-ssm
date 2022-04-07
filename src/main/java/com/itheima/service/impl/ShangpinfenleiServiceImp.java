package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.entity.Fangyingting;
import com.itheima.entity.Shangpinfenlei;
import com.itheima.mapper.ShangpinfenleiMapper;
import com.itheima.service.ShangpinfenleiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShangpinfenleiServiceImp implements ShangpinfenleiService {

    @Autowired
    private ShangpinfenleiMapper shangpinfenleiMapper;

    @Override
    public List<Shangpinfenlei> findAll(int pagenum, int pagesize, String sort,String value) {
        PageHelper.startPage(pagenum,pagesize);

        List<Shangpinfenlei> shangpinfenleiList = shangpinfenleiMapper.findAll(sort,value);
        return shangpinfenleiList;
    }

    @Override
    public void update(Shangpinfenlei shangpinfenlei) {
        if (shangpinfenlei.getId() == null){
            shangpinfenleiMapper.insert(shangpinfenlei);
            return;
        }
        shangpinfenleiMapper.updateByPrimaryKey(shangpinfenlei);

    }

    @Override
    public void del(Long id) {
        shangpinfenleiMapper.deleteByPrimaryKey(id);

    }

    @Override
    public List<Shangpinfenlei> spflfindAll() {

        List<Shangpinfenlei> shangpinfenleiList = shangpinfenleiMapper.spflfindAll();
        return shangpinfenleiList;
    }
}
