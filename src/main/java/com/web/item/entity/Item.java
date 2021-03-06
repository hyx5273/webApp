package com.web.item.entity;

/**
 * 商品实体类
 */
public class Item {
    private Long itemid;    //商品ID
    private String name;    //商品名称
    private Double price;   //商品价格
    private Long stock;       //商品库存
    private Long storeid;   //商品所属店家ID
    private String description; //商品描述
    private Integer state;     //商品状态0未审核 1已审核 2已下架

    public Long getItemid() {
        return itemid;
    }

    public void setItemid(Long itemid) {
        this.itemid = itemid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getStoreid() {
        return storeid;
    }

    public void setStoreid(Long storeid) {
        this.storeid = storeid;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
