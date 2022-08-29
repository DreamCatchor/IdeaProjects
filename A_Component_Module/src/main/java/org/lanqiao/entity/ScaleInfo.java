package org.lanqiao.entity;

import java.util.Date;

/**
 * @Author: lanqiao
 */
public class ScaleInfo {
    // 蛋糕规格 id
    private int id;
    // 蛋糕尺寸
    private int size;
    // 适合分享的人数
    private String shareNumber;
    // 创建时间
    private Date createTime;
    // 修改时间
    private Date modifyTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getShareNumber() {
        return shareNumber;
    }

    public void setShareNumber(String shareNumber) {
        this.shareNumber = shareNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
                "id=" + id +
                ", size=" + size +
                ", shareNumber='" + shareNumber + '\'' +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
