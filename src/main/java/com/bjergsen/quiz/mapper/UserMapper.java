package com.bjergsen.quiz.mapper;

import com.bjergsen.quiz.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yongxin
 * @Date 2020/2/23
 */
@Repository
@Mapper
public interface UserMapper {
    @Insert("insert into " +
            "user(account_id, name, token, gmt_create, gmt_modified) values (" +
            "#{accountId}, #{name}, #{token}, #{gmtCreate}, #{gmtModified}" +
            ")")
    void insertUser(User user);

    @Select("select * from user where token=#{token}")
    User findUserByToken(@RequestParam("token") String token);
}
