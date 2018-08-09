package com.ms.myblog.service;

import com.ms.myblog.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserService {
    User saveOrUpdateUser(User user);

    User registerUser(User user);

    void removeUser(Long id);

    Optional<User> getUserByid(Long id);

    Page<User> listUserByNameLike(String name, Pageable pageable);

}