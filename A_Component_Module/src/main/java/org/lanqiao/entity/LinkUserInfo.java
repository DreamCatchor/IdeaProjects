package org.lanqiao.entity;

import java.util.Date;

/**
 * @Author: lanqiao
 */
public class LinkUserInfo {
    // 收货人id
    private int id;
    // 收货人姓名
    private String linkUserName;
    // 收货人人手机号
    private String phone;
    // 收货人地址
    private String address;
    // 用户 id
    private int userId;
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

    public String getLinkUserName() {
        return linkUserName;
    }

    public void setLinkUserName(String linkUserName) {
        this.linkUserName = linkUserName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
        return "LinkUserInfo{" +
                "id=" + id +
                ", linkUserName='" + linkUserName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", userId=" + userId +
                ", creteTime=" + creteTime +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
