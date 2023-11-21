package com.cloud.cybersecurity.course.model.service.impl;

import com.cloud.cybersecurity.course.model.collection.Student;
import com.cloud.cybersecurity.course.model.crud.repository.CourseCrudRepository;
import com.cloud.cybersecurity.course.model.service.CourseService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseServiceImpl implements CourseService {

    public static final String THE_USER_IS_ALREADY_REGISTERED = "El usuario ya se encuentra registrado con esa identificación";
    private final CourseCrudRepository courseCrudRepository;

    public CourseServiceImpl(CourseCrudRepository courseCrudRepository) {
        this.courseCrudRepository = courseCrudRepository;
    }

    @Override
    public Student saveStudent(Student student) throws Exception {
        if(courseCrudRepository.findById(student.getId()).isPresent()){
            throw new Exception(THE_USER_IS_ALREADY_REGISTERED);
        }
        return courseCrudRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return courseCrudRepository.findAll();
    }
}
