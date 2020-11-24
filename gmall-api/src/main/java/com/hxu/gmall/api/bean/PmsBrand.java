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
public class PmsBrand implements Serializable {

    @Id
    private String id;
    private String name;
    private String firstLetter;
    private int sort;
    private int factoryStatus;
    private int showStatus;
    private int productCount;
    private String productCommentCount;
    private String logo;
    private String bigPic;
    private String brandStory;


}
