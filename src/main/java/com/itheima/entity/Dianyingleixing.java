package com.itheima.entity;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class Dianyingleixing {
    private Long id;

    private Date addtime;

    private String dianyingleixing;

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

    public String getDianyingleixing() {
        return dianyingleixing;
    }

    public void setDianyingleixing(String dianyingleixing) {
        this.dianyingleixing = dianyingleixing == null ? null : dianyingleixing.trim();
    }
}