package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.entity.Dianyingleixing;
import com.itheima.entity.Fangyingting;
import com.itheima.entity.Yonghu;
import com.itheima.mapper.DianyingleixingMapper;
import com.itheima.mapper.YonghuMapper;
import com.itheima.service.MovieTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieTypeServiceImp implements MovieTypeService {

    @Autowired
    private Dianyingleixing dianyingleixing;

    @Autowired
    private DianyingleixingMapper dianyingleixingMapper;

    @Override
    public List<Dianyingleixing> findAll(int pagenum, int pagesize, String sort,String value) {

        PageHelper.startPage(pagenum,pagesize);

        List<Dianyingleixing> dianyingleixingList = dianyingleixingMapper.findAll(sort,value);
        return dianyingleixingList;
    }

    @Override
    public void update(Dianyingleixing dianyingleixing) {
        if (dianyingleixing.getId() == null){
            dianyingleixingMapper.insert(dianyingleixing);
            return;
        }
        dianyingleixingMapper.updateByPrimaryKey(dianyingleixing);

    }

    @Override
    public void del(Long id) {
        dianyingleixingMapper.deleteByPrimaryKey(id);

    }

    @Override
    public List<Dianyingleixing> mtfindAll() {

        List<Dianyingleixing> List = dianyingleixingMapper.mtfindAll();

        return List;
    }
}
