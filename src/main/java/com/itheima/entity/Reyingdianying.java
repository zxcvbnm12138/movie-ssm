package com.itheima.entity;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class Reyingdianying {
    private Long id;

    private Date addtime;

    private String dianyingmingcheng;

    private String dianyingleixing;

    private String haibao;

    private String daoyan;

    private String zhuyan;

    private String zhipiandiqu;

    private Date shangyingriqi;

    private String pianzhang;

    private String dianyingyugao;

    private String dianyingjianjie;

    private String fangyingting;

    private Date changci;

    private Date clicktime;

    private Integer clicknum;

    private Float price;

    private Integer number;

    private String selected;

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

    public String getDianyingmingcheng() {
        return dianyingmingcheng;
    }

    public void setDianyingmingcheng(String dianyingmingcheng) {
        this.dianyingmingcheng = dianyingmingcheng == null ? null : dianyingmingcheng.trim();
    }

    public String getDianyingleixing() {
        return dianyingleixing;
    }

    public void setDianyingleixing(String dianyingleixing) {
        this.dianyingleixing = dianyingleixing == null ? null : dianyingleixing.trim();
    }

    public String getHaibao() {
        return haibao;
    }

    public void setHaibao(String haibao) {
        this.haibao = haibao == null ? null : haibao.trim();
    }

    public String getDaoyan() {
        return daoyan;
    }

    public void setDaoyan(String daoyan) {
        this.daoyan = daoyan == null ? null : daoyan.trim();
    }

    public String getZhuyan() {
        return zhuyan;
    }

    public void setZhuyan(String zhuyan) {
        this.zhuyan = zhuyan == null ? null : zhuyan.trim();
    }

    public String getZhipiandiqu() {
        return zhipiandiqu;
    }

    public void setZhipiandiqu(String zhipiandiqu) {
        this.zhipiandiqu = zhipiandiqu == null ? null : zhipiandiqu.trim();
    }

    public Date getShangyingriqi() {
        return shangyingriqi;
    }

    public void setShangyingriqi(Date shangyingriqi) {
        this.shangyingriqi = shangyingriqi;
    }

    public String getPianzhang() {
        return pianzhang;
    }

    public void setPianzhang(String pianzhang) {
        this.pianzhang = pianzhang == null ? null : pianzhang.trim();
    }

    public String getDianyingyugao() {
        return dianyingyugao;
    }

    public void setDianyingyugao(String dianyingyugao) {
        this.dianyingyugao = dianyingyugao == null ? null : dianyingyugao.trim();
    }

    public String getDianyingjianjie() {
        return dianyingjianjie;
    }

    public void setDianyingjianjie(String dianyingjianjie) {
        this.dianyingjianjie = dianyingjianjie == null ? null : dianyingjianjie.trim();
    }

    public String getFangyingting() {
        return fangyingting;
    }

    public void setFangyingting(String fangyingting) {
        this.fangyingting = fangyingting == null ? null : fangyingting.trim();
    }

    public Date getChangci() {
        return changci;
    }

    public void setChangci(Date changci) {
        this.changci = changci;
    }

    public Date getClicktime() {
        return clicktime;
    }

    public void setClicktime(Date clicktime) {
        this.clicktime = clicktime;
    }

    public Integer getClicknum() {
        return clicknum;
    }

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected == null ? null : selected.trim();
    }
}