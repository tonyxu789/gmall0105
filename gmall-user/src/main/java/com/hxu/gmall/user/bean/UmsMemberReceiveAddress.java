package com.hxu.gmall.user.bean;

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
public class UmsMemberReceiveAddress implements Serializable {

    private static final long serialVersionUID = 292347417663027764L;

    @Id
    private Integer id;
    private Integer memberId;
    private String name;
    private String phoneNumber;
    private Integer defaultStatus;
    private String postCode;
    private String province;
    private String city;
    private String region;
    private String detailAddress;
}
