package org.lanqiao.entity;

import java.util.Date;

/**
 * @Author: lanqiao
 */
public class CakeInfo {
    // 蛋糕id
    private int id;
    // 蛋糕介绍
    private String introduce;
    // 蛋糕品牌
    private String brand;
    // 蛋糕图片
    private String cakePic;
    // 蛋糕详情图片
    private String cakeDetailPic;
    // 蛋糕分类 id
    private int cakeClassId;
    // 创建时间
    private Date creteTime;
    // 修改时间
    private Date modifyTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCakePic() {
        return cakePic;
    }

    public void setCakePic(String cakePic) {
        this.cakePic = cakePic;
    }

    public String getCakeDetailPic() {
        return cakeDetailPic;
    }

    public void setCakeDetailPic(String cakeDetailPic) {
        this.cakeDetailPic = cakeDetailPic;
    }

    public int getCakeClassId() {
        return cakeClassId;
    }

    public void setCakeClassId(int cakeClassId) {
        this.cakeClassId = cakeClassId;
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
        return "CakeInfo{" +
                "id=" + id +
                ", introduce='" + introduce + '\'' +
                ", brand='" + brand + '\'' +
                ", cakePic='" + cakePic + '\'' +
                ", cakeDetailPic='" + cakeDetailPic + '\'' +
                ", cakeClassId=" + cakeClassId +
                ", creteTime=" + creteTime +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
