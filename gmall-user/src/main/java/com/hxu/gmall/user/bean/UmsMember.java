package com.hxu.gmall.user.bean;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UmsMember implements Serializable {

    private static final long serialVersionUID = 8660917418870301518L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer memberLevelId;
    private String username;
    private String password;
    private String nickname;
    private String phone;
    private Integer status;
    private Data createTime;
    private String icon;
    private Integer gender;
    private Data birthday;
    private String city;
    private String job;
    private String personalizedSignature;
    private Integer sourceUid;
    private Integer sourceType;
    private Integer integration;
    private Integer growth;
    private Integer luckyCount;
    private Integer historyIntegration;
    private String accessToken;
    private String accessCode;


}
