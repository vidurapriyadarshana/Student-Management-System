package edu.ijse.demo.service;

import edu.ijse.demo.entity.StudentEntity;
import edu.ijse.demo.model.Student;

public interface StudentService {
    void saveStudent(Student student);
    Iterable<StudentEntity> getStudent();
}
