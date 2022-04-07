package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.entity.Jijiangshangying;
import com.itheima.entity.Reyingdianying;
import com.itheima.mapper.JijiangshangyingMapper;
import com.itheima.service.JijiangshangyingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JijiangshangyingServiceImp implements JijiangshangyingService {

    @Autowired
    private JijiangshangyingMapper jijiangshangyingMapper;

    @Override
    public List<Jijiangshangying> findAll(int pagenum, int pagesize, String sort,String value) {
        PageHelper.startPage(pagenum,pagesize);
        //System.out.println(sort);
        List<Jijiangshangying> jijiangshangyingList = jijiangshangyingMapper.findAll(sort,value);
        return jijiangshangyingList;
    }

    @Override
    public void update(Jijiangshangying jijiangshangying) {
        if (jijiangshangying.getId() == null){
            jijiangshangyingMapper.insert(jijiangshangying);
            return;
        }
        jijiangshangyingMapper.updateByPrimaryKey(jijiangshangying);

    }

    @Override
    public void del(Long id) {
        jijiangshangyingMapper.deleteByPrimaryKey(id);

    }
}
