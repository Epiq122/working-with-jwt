package com.gleasondev.gradesubmission.repository;

import com.gleasondev.gradesubmission.entity.Grade;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface GradeRepository extends CrudRepository<Grade, Long> {
     Optional<Grade> findByStudentIdAndCourseId(Long studentId, Long courseId);
     List<Grade> findByStudentId(Long studentId);
     List<Grade> findByCourseId(Long courseId);
     @Transactional
     void deleteByStudentIdAndCourseId(Long studentId, Long courseId);

}