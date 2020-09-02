package com.tr.myproject.service.request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName UserEntity
 * @Description: TODO
 * @Author pj
 * @Date 2020/9/2
 * @Version V1.0
 **/
@Data
public class UserEntity implements Serializable {
    private Long id;
    private String guid;
    private String name;
    private String age;
    private Date createTime;
}



