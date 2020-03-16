package com.github.hitotright.eurekaconsumer.entity;

import java.io.Serializable;

/**
 * 商品表(Goods)实体类
 *
 * @author makejava
 * @since 2020-03-16 14:35:32
 */
public class Goods implements Serializable {
    private static final long serialVersionUID = 914390551553361491L;
    /**
    * 商品id
    */
    private Integer id;
    /**
    * 商品标题
    */
    private String title;
    /**
    * 商品图片
    */
    private String pic;
    /**
    * 商品描述
    */
    private String desc;
    /**
    * 商品价格
    */
    private Double price;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Goods(){}

    public Goods(Integer id,String title,String pic,String desc,Double price){
        this.id = id; this.title = title; this.pic = pic; this.desc = desc; this.price = price;
    }
    @Override
    public String toString ( ) {
        return "goods:id"+this.id+",title:"+this.title+",pic:"+this.pic+",desc:"+this.desc+",price:"+this.price;
    }
}