package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.entity.Jijiangshangying;
import com.itheima.entity.Shangpinfenlei;
import com.itheima.entity.Shangpinxinxi;
import com.itheima.mapper.ShangpinxinxiMapper;
import com.itheima.service.ShangpinfenleiService;
import com.itheima.service.ShangpinxinxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShangpinxinxiServiceImp implements ShangpinxinxiService {

    @Autowired
    private ShangpinxinxiMapper shangpinxinxiMapper;

    @Override
    public List<Shangpinxinxi> findAll(int pagenum, int pagesize, String sort,String value) {
        PageHelper.startPage(pagenum,pagesize);
        //System.out.println(sort);
        List<Shangpinxinxi> shangpinxinxiList = shangpinxinxiMapper.findAll(sort,value);
        return shangpinxinxiList;
    }

    @Override
    public void update(Shangpinxinxi shangpinxinxi) {
        if (shangpinxinxi.getId() == null){
            shangpinxinxiMapper.insert(shangpinxinxi);
            return;
        }
        shangpinxinxiMapper.updateByPrimaryKey(shangpinxinxi);

    }

    @Override
    public void del(Long id) {
        shangpinxinxiMapper.deleteByPrimaryKey(id);

    }
}
