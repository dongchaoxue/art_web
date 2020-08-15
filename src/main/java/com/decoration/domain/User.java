package com.decoration.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by dongchao on 2020/8/15 09:57
 */
@Data
public class User {

    private Integer id;

    private String userName;

    private Date createTime;

    private Date updateTime;
}
