package com.itheima.entity;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class Jijiangshangying {
    private Long id;

    private Date addtime;

    private String dianyingmingcheng;

    private String dianyingleixing;

    private String haibao;

    private String daoyan;

    private String zhuyan;

    private String zhipiandiqu;

    private String dianyingyugao;

    private Date shangyingriqi;

    private String pianzhang;

    private String dianyingjianjie;

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

    public String getDianyingyugao() {
        return dianyingyugao;
    }

    public void setDianyingyugao(String dianyingyugao) {
        this.dianyingyugao = dianyingyugao == null ? null : dianyingyugao.trim();
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

    public String getDianyingjianjie() {
        return dianyingjianjie;
    }

    public void setDianyingjianjie(String dianyingjianjie) {
        this.dianyingjianjie = dianyingjianjie == null ? null : dianyingjianjie.trim();
    }
}