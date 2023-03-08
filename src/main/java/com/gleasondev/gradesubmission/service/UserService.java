package com.gleasondev.gradesubmission.service;


import com.gleasondev.gradesubmission.entity.User;

public interface UserService {
    User getUser(Long id);
    User saveUser(User user);
}
