package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.entity.Shangpingoumai;
import com.itheima.entity.Shangpinxinxi;
import com.itheima.mapper.ShangpingoumaiMapper;
import com.itheima.service.ShangpingoumaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShangpingoumaiServiceImp implements ShangpingoumaiService {

    @Autowired
    private ShangpingoumaiMapper shangpingoumaiMapper;

    @Override
    public List<Shangpingoumai> findAll(int pagenum, int pagesize, String sort,String value) {
        PageHelper.startPage(pagenum,pagesize);
        //System.out.println(sort);
        List<Shangpingoumai> shangpingoumaiList = shangpingoumaiMapper.findAll(sort,value);
        return shangpingoumaiList;

    }

    @Override
    public void update(Shangpingoumai shangpingoumai) {
        shangpingoumaiMapper.updateByPrimaryKey(shangpingoumai);

    }

    @Override
    public void del(Long id) {
        shangpingoumaiMapper.deleteByPrimaryKey(id);

    }
}
