package com.tr.myproject.service.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Created by pj on 2019/3/8.
 */
@Data
public class UserRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String phone;


}
