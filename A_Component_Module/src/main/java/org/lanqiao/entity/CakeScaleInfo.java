package org.lanqiao.entity;

import java.util.Date;

/**
 * @Author: lanqiao
 */
public class CakeScaleInfo {
    // 蛋糕id
    private int cakeId;
    // 蛋糕规格id
    private int scaleId;
    // 蛋糕价格
    private Double price;
    // 创建时间
    private Date creteTime;
    // 修改时间
    private Date modifyTime;

    public int getCakeId() {
        return cakeId;
    }

    public void setCakeId(int cakeId) {
        this.cakeId = cakeId;
    }

    public int getScaleId() {
        return scaleId;
    }

    public void setScaleId(int scaleId) {
        this.scaleId = scaleId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreteTime() {
        return creteTime;
    }

    public void setCreteTime(Date creteTime) {
        this.creteTime = creteTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "CakeScaleInfo{" +
                "cakeId=" + cakeId +
                ", scaleId=" + scaleId +
                ", price=" + price +
                ", creteTime=" + creteTime +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
