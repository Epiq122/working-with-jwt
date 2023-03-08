package com.gleasondev.gradesubmission.repository;

import com.gleasondev.gradesubmission.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
