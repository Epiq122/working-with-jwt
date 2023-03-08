package com.gleasondev.gradesubmission.repository;

import com.gleasondev.gradesubmission.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
