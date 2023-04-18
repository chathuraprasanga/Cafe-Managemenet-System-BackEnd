package com.inn.cafe.dao;

import com.inn.cafe.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository <User, Integer> {


//    Developer ID = Chathura Prasanga
//    Date = 18.04.2023
    User findByEmailId(@Param("email")String email);

}
