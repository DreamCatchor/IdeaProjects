package org.lanqiao.entity;

import java.util.Date;

/**
 * @Author: lanqiao
 */
public class OrderDetail {
    // 订单详情id
    private int id;
    // 订单编号
    private String orderNo;
    // 蛋糕数量
    private int cakeCounts;
    // 蛋糕尺寸
    private int size;
    // 蛋糕价格
    private Double price;
    // 蛋糕id
    private int cakeId;
    // 创建时间
    private Date createTime;
    // 修改时间
    private Date modifyTime;

    // 蛋糕名称
    private String cakeName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getCakeCounts() {
        return cakeCounts;
    }

    public void setCakeCounts(int cakeCounts) {
        this.cakeCounts = cakeCounts;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getCakeId() {
        return cakeId;
    }

    public void setCakeId(int cakeId) {
        this.cakeId = cakeId;
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


    public String getCakeName() {
        return cakeName;
    }

    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", cakeCounts=" + cakeCounts +
                ", size=" + size +
                ", price=" + price +
                ", cakeId='" + cakeId + '\'' +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
