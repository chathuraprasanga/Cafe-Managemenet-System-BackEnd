package com.inn.cafe.dao;

import com.inn.cafe.POJO.User;
import com.inn.cafe.wrapper.UserWrapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends JpaRepository <User, Integer> {


//    Developer ID = Chathura Prasanga
//    Date = 18.04.2023
    User findByEmailId(@Param("email")String email);

    List<UserWrapper> getAllUser();

}
