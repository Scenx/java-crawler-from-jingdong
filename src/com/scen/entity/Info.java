package com.scen.entity;

/**
 * javabean（pojo）
 * 来承接重网页中提取的数据
 * Created by Scen  on 2017/9/17.
 */
public class Info {
    /*成员变量*/
    private String price; //价格
    private String model; //型号
    private String createDate;//创建时间
    private String updateDate;//更新时间

    //构造方法
    //成员方法（属性） getter和setter
    //重写toString（）方法


    public Info() {
    }

    //构造方法

    public Info(String price, String model, String createDate, String updateDate) {
        this.price = price;
        this.model = model;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }


    //get set开始

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    //get set 结束


    @Override //重写toString（）方法
    public String toString() {
        return "Info{" +
                "price='" + price + '\'' +
                ", model='" + model + '\'' +
                ", createDate='" + createDate + '\'' +
                ", updateDate='" + updateDate + '\'' +
                '}';
    }
}
