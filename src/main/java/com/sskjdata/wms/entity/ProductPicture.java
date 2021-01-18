package com.sskjdata.wms.entity;

import java.io.Serializable;

public class ProductPicture implements Serializable {
    private Integer id;

    private Integer productId;

    private String productPicture;

    private String intro;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public ProductPicture withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public ProductPicture withProductId(Integer productId) {
        this.setProductId(productId);
        return this;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductPicture() {
        return productPicture;
    }

    public ProductPicture withProductPicture(String productPicture) {
        this.setProductPicture(productPicture);
        return this;
    }

    public void setProductPicture(String productPicture) {
        this.productPicture = productPicture == null ? null : productPicture.trim();
    }

    public String getIntro() {
        return intro;
    }

    public ProductPicture withIntro(String intro) {
        this.setIntro(intro);
        return this;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", productPicture=").append(productPicture);
        sb.append(", intro=").append(intro);
        sb.append("]");
        return sb.toString();
    }
}