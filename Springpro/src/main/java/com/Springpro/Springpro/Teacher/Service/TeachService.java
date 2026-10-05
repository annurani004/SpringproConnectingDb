package com.Springpro.Springpro.Teacher.Service;

import com.Springpro.Springpro.Teacher.Entity.Teacher;
import com.Springpro.Springpro.Teacher.Repository.TeachRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachService {

    @Autowired
    private TeachRepo teachRepo;

    public Teacher saveDetails(Teacher teacher) {
        return teachRepo.save(teacher);
    }

    public List<Teacher> getDetails() {
        return teachRepo.findAll();
    }

    public boolean deleteTeacher(int id) {
        if (teachRepo.existsById(id)) {
            teachRepo.deleteById(id);
            return true;
        }
        return false;
    }
    public List<Teacher> getTeacherByCls(String cls){
        return teachRepo.findByCls(cls);
    }
}
