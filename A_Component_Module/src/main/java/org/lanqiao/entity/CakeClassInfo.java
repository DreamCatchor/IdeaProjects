package org.lanqiao.entity;

import java.util.Date;

/**
 * @Author: lanqiao
 */
public class CakeClassInfo {
    // 蛋糕分类id
    private int id;
    // 蛋糕分类名称
    private String className;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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
        return "CakeClassInfo{" +
                "id=" + id +
                ", className='" + className + '\'' +
                ", creteTime=" + creteTime +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
