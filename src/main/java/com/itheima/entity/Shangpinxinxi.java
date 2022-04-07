package com.itheima.entity;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class Shangpinxinxi {
    private Long id;

    private Date addtime;

    private String shangpinmingcheng;

    private String fenlei;

    private String tupian;

    private String guige;

    private Float jiage;

    private String shangpinxiangqing;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getShangpinmingcheng() {
        return shangpinmingcheng;
    }

    public void setShangpinmingcheng(String shangpinmingcheng) {
        this.shangpinmingcheng = shangpinmingcheng == null ? null : shangpinmingcheng.trim();
    }

    public String getFenlei() {
        return fenlei;
    }

    public void setFenlei(String fenlei) {
        this.fenlei = fenlei == null ? null : fenlei.trim();
    }

    public String getTupian() {
        return tupian;
    }

    public void setTupian(String tupian) {
        this.tupian = tupian == null ? null : tupian.trim();
    }

    public String getGuige() {
        return guige;
    }

    public void setGuige(String guige) {
        this.guige = guige == null ? null : guige.trim();
    }

    public Float getJiage() {
        return jiage;
    }

    public void setJiage(Float jiage) {
        this.jiage = jiage;
    }

    public String getShangpinxiangqing() {
        return shangpinxiangqing;
    }

    public void setShangpinxiangqing(String shangpinxiangqing) {
        this.shangpinxiangqing = shangpinxiangqing == null ? null : shangpinxiangqing.trim();
    }
}