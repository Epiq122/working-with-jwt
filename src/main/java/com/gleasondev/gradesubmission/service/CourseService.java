package com.gleasondev.gradesubmission.service;

import com.gleasondev.gradesubmission.entity.Course;
import com.gleasondev.gradesubmission.entity.Student;

import java.util.List;
import java.util.Set;

public interface CourseService {
    Course getCourse(Long id);
    Course saveCourse(Course course);
    void deleteCourse(Long id);    
    Course addStudentToCourse(Long studentId, Long courseId);
    List<Course> getCourses();
    Set<Student> getEnrolledStudents(Long id);
}
