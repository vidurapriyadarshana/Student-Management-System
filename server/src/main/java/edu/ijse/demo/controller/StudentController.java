package edu.ijse.demo.controller;

import edu.ijse.demo.entity.StudentEntity;
import edu.ijse.demo.model.Student;
import edu.ijse.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
@CrossOrigin
public class StudentController {


    final StudentService service;

    @PostMapping("/create")
    public Map<String, String> saveStudent(@RequestBody Student student){
        System.out.println(student);
        service.saveStudent(student);

        return Collections.singletonMap("message","success");
    }

    @GetMapping("/all")
    public Iterable<StudentEntity> getStudent(){
        return service.getStudent();
    }
}
