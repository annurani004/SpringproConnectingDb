package com.Springpro.Springpro.Teacher.Repository;

import com.Springpro.Springpro.Teacher.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TeachRepo extends JpaRepository<Teacher, Integer> {

    List<Teacher> findByCls(String cls);
}
