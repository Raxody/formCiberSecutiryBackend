package com.cloud.cybersecurity.course.model.crud.repository;

import com.cloud.cybersecurity.course.model.collection.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseCrudRepository extends MongoRepository<Student, Long> {

}
