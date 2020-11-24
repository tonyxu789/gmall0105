package com.hxu.gmall.api.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OmsOrderItem implements Serializable {

    private String id;
    private String orderId;
    private String orderSn;
    private String productId;
    private String productPic;
    private String productName;
    private String productBrand;
    private String productSn;
    private String productPrice;
    private int productQuantity;
    private String productSkuId;
    private String productSkuCode;
    private String productCategoryId;
    private String sp1;
    private String sp2;
    private String sp3;
    private String promotionName;
    private BigDecimal promotionAmount;
    private BigDecimal couponAmount;
    private BigDecimal integrationAmount;
    private String realAmount;
    private int giftIntegration;
    private int giftGrowth;
    private String productAttr;

}
