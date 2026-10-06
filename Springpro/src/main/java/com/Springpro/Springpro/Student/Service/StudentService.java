package com.Springpro.Springpro.Student.Service;

import com.Springpro.Springpro.Student.Entity.Student;
import com.Springpro.Springpro.Student.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student saveDetails(Student student){

        return studentRepo.save(student);
    }

    public List<Student>  getDetails(){
        return studentRepo.findAll();
    }

    public boolean deleteStudent(int id) {
        if (studentRepo.existsById(id)) {
            studentRepo.deleteById(id);
            return true;
        }
        return false;
    }

    public Student findById(int id) {
        Optional<Student> student = studentRepo.findById(id);
        return student.orElse(null);
    }

    public void save(Student student) {
            studentRepo.save(student );
    }
    public List<Student> getStudentByCourse(String course){
        return studentRepo.findByCourse(course);
    }
}
