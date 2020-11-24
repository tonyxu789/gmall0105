package com.hxu.gmall.api.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PmsProductSaleAttr implements Serializable {

    @Id
    @Column
    String id ;

    @Column
    String productId;

    @Column
    String saleAttrId;

    @Column
    String saleAttrName;


    @Transient
    List<PmsProductSaleAttrValue> pmsProductSaleAttrValueList;

}
