package com.Springpro.Springpro.Student.Repository;

import com.Springpro.Springpro.Student.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    List<Student> findByCourse(String course);
}
