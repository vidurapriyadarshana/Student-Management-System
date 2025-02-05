package edu.ijse.demo.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ijse.demo.entity.StudentEntity;
import edu.ijse.demo.model.Student;
import edu.ijse.demo.repo.StudentRepo;
import edu.ijse.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    private final ObjectMapper objectMapper;

    @Override
    public void saveStudent(Student student) {
        StudentEntity studentEntity = objectMapper.convertValue(student, StudentEntity.class);
        studentRepo.save(studentEntity);
    }

    @Override
    public List<StudentEntity> getStudent(){
        return studentRepo.findAll();
    }
}
