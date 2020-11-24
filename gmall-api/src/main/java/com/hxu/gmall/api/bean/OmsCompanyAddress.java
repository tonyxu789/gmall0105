package com.hxu.gmall.api.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OmsCompanyAddress implements Serializable {

    @Id
    private String id;
    private String addressName;
    private int sendStatus;
    private int receiveStatus;
    private String name;
    private String phone;
    private String province;
    private String city;
    private String region;
    private String detailAddress;

}
