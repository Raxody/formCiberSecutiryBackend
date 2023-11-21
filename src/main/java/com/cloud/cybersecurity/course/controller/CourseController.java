package com.cloud.cybersecurity.course.controller;

import com.cloud.cybersecurity.course.model.collection.Student;
import com.cloud.cybersecurity.course.model.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/course")
public class CourseController {
    public static final String ERROR = "error";
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveStudentInCourse(@RequestBody Student student){
        try{
            return new ResponseEntity<>(courseService.saveStudent(student), HttpStatus.CREATED);
        }catch (Exception e){
            Map<String, String> a = new HashMap<>();
            a.put(ERROR,e.getMessage());
            return new ResponseEntity<>(a, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> saveStudentInCourse(){
       return new ResponseEntity<>(courseService.getAllStudents(), HttpStatus.OK);
    }

}
