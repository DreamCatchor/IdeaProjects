package org.lanqiao.entity;

import java.util.Date;

/**
 * @Author: lanqiao
 */
public class Orders {
    // 订单 id
    private Integer id;
    // 订单编号
    private String orderNo;
    // 交易编号
    private String tradeNo;
    // 订单状态
    private int status;
    // 支付金额
    private Double payAmount;
    // 收货人id
    private int linkUserId;
    // 用户 id
    private int userId;
    // 创建时间
    private Date createTime;
    // 修改时间
    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public int getLinkUserId() {
        return linkUserId;
    }

    public void setLinkUserId(int linkUserId) {
        this.linkUserId = linkUserId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date creteTime) {
        this.createTime = creteTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", tradeNo='" + tradeNo + '\'' +
                ", status=" + status +
                ", payAmount=" + payAmount +
                ", linkUserId=" + linkUserId +
                ", userId=" + userId +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
