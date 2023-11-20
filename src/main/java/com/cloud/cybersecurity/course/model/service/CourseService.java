package com.cloud.cybersecurity.course.model.service;

import com.cloud.cybersecurity.course.model.collection.Student;

import java.util.List;

public interface CourseService {

    Student saveStudent(Student student) throws Exception;

    List<Student> getAllStudents();

}
