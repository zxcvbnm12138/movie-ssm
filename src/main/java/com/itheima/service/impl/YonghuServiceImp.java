package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.entity.Users;
import com.itheima.entity.Yonghu;
import com.itheima.mapper.YonghuMapper;
import com.itheima.service.YonghuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YonghuServiceImp implements YonghuService {

    @Autowired
    private Yonghu yonghu;

    @Autowired
    private YonghuMapper yonghuMapper;


    @Override
    public List<Yonghu> findAll(int pagenum,int pagesize,String sort,String value) {

        PageHelper.startPage(pagenum,pagesize);
        //System.out.println(sort);
        List<Yonghu> yonghuList = yonghuMapper.findAll(sort,value);
        return yonghuList;
    }

    @Override
    public void update(Yonghu yonghu) {
        //System.out.println(yonghu.getId());
        if (yonghu.getId() == null){
            yonghuMapper.insert(yonghu);
            return;
        }
        yonghuMapper.updateByPrimaryKey(yonghu);
    }

    @Override
    public void del(Long id) {
        yonghuMapper.deleteByPrimaryKey(id);
    }
}
