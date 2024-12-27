package edu.ijse.demo.repo;

import edu.ijse.demo.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends JpaRepository<StudentEntity,Integer> {

}
