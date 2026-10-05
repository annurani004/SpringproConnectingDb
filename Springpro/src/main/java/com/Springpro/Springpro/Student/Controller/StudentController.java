package com.Springpro.Springpro.Student.Controller;

import com.Springpro.Springpro.Student.Entity.Student;
import com.Springpro.Springpro.Student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student){
        return studentService.saveDetails(student);
    }
    @GetMapping("/getStudent")
    public List<Student> getDetails(){
        return studentService.getDetails();
    }

    @GetMapping("/student/course/{course}")
    public List<Student> getStudentByCourse(@PathVariable String course){
        return studentService.getStudentByCourse(course);
    }


    @PatchMapping(path = "/{id}", consumes = "application/json")
    public ResponseEntity<Student> updateUser(@PathVariable int id, @RequestBody Map<String, Object> updates) {
//    Step1 - fetch the data from database.
        Student student = studentService.findById(id);
        if (student == null) {
            return ResponseEntity.notFound().build();
        }

// step-2: change the data that need to be updated.
        for (String key : updates.keySet()) {
            System.out.println(key + " occupies value " + updates.get(key));
            if(key.equals("name")){
                String newName = updates.get(key).toString();
                student.setName(newName);
            }
            if(key.equals("marks")){
                int newMarks = Integer.parseInt(updates.get(key).toString());
                student.setMarks(newMarks);
            }
        }

// Step-3: save the data
        studentService.save(student);
        return ResponseEntity.ok(student);
    }


    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        boolean deleted = studentService.deleteStudent(id);
        if (deleted) {
            return "Student with ID " + id + " deleted successfully!";
        } else {
            return "Student with ID " + id + " not found!";
        }
    }
}
