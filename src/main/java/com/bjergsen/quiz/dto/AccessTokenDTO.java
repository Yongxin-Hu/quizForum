package com.bjergsen.quiz.dto;

import lombok.Data;

/**
 * @author yongxin
 * @Date 2020/2/22
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
