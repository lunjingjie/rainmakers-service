package com.rainmakers.mapper;

import com.rainmakers.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import sun.security.util.Password;

/**
 * @author Administrator
 */
@Repository
public interface UserMapper {

    /**
     * 获取一个user对象
     *
     * @param username
     * @param password
     * @return user
     */
    @Select("select * from db_user where username = #{username} and password = #{password}")
    User getUser(@Param("username") String username, @Param("password") String password);

}
