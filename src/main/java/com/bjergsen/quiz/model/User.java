package com.bjergsen.quiz.model;

import lombok.Data;

/**
 * @author yongxin
 * @Date 2020/2/23
 */
@Data
public class User {
    private int id;
    private String accountId;
    private String name;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
}
