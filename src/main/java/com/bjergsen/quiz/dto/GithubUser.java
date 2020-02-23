package com.bjergsen.quiz.dto;

import lombok.Data;

/**
 * @author yongxin
 * @Date 2020/2/23
 */
@Data
public class GithubUser {
    private String login;
    private Long id;
    private String bio;
}
