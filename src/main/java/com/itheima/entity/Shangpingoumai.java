package com.itheima.entity;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class Shangpingoumai {
    private Long id;

    private Date addtime;

    private String dingdanbianhao;

    private String shangpinmingcheng;

    private String tupian;

    private String guige;

    private Integer shuliang;

    private Integer jiage;

    private Integer zongjine;

    private Date xiadanshijian;

    private String yonghuming;

    private String shouji;

    private String sfsh;

    private String shhf;

    private String ispay;

    private Long userid;

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

    public String getDingdanbianhao() {
        return dingdanbianhao;
    }

    public void setDingdanbianhao(String dingdanbianhao) {
        this.dingdanbianhao = dingdanbianhao == null ? null : dingdanbianhao.trim();
    }

    public String getShangpinmingcheng() {
        return shangpinmingcheng;
    }

    public void setShangpinmingcheng(String shangpinmingcheng) {
        this.shangpinmingcheng = shangpinmingcheng == null ? null : shangpinmingcheng.trim();
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

    public Integer getShuliang() {
        return shuliang;
    }

    public void setShuliang(Integer shuliang) {
        this.shuliang = shuliang;
    }

    public Integer getJiage() {
        return jiage;
    }

    public void setJiage(Integer jiage) {
        this.jiage = jiage;
    }

    public Integer getZongjine() {
        return zongjine;
    }

    public void setZongjine(Integer zongjine) {
        this.zongjine = zongjine;
    }

    public Date getXiadanshijian() {
        return xiadanshijian;
    }

    public void setXiadanshijian(Date xiadanshijian) {
        this.xiadanshijian = xiadanshijian;
    }

    public String getYonghuming() {
        return yonghuming;
    }

    public void setYonghuming(String yonghuming) {
        this.yonghuming = yonghuming == null ? null : yonghuming.trim();
    }

    public String getShouji() {
        return shouji;
    }

    public void setShouji(String shouji) {
        this.shouji = shouji == null ? null : shouji.trim();
    }

    public String getSfsh() {
        return sfsh;
    }

    public void setSfsh(String sfsh) {
        this.sfsh = sfsh == null ? null : sfsh.trim();
    }

    public String getShhf() {
        return shhf;
    }

    public void setShhf(String shhf) {
        this.shhf = shhf == null ? null : shhf.trim();
    }

    public String getIspay() {
        return ispay;
    }

    public void setIspay(String ispay) {
        this.ispay = ispay == null ? null : ispay.trim();
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }
}