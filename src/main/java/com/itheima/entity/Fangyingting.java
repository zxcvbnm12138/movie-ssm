package com.itheima.entity;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class Fangyingting {
    private Long id;

    private Date addtime;

    private String fangyingting;

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

    public String getFangyingting() {
        return fangyingting;
    }

    public void setFangyingting(String fangyingting) {
        this.fangyingting = fangyingting == null ? null : fangyingting.trim();
    }
}