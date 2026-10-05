package com.Springpro.Springpro.Teacher.Controller;

import com.Springpro.Springpro.Teacher.Entity.*;
import com.Springpro.Springpro.Teacher.Service.TeachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeachController {

    @Autowired
    private TeachService teachService;

    @PostMapping("/addTeacher")
    public Teacher postDetails(@RequestBody Teacher teacher) {
        return teachService.saveDetails(teacher);
    }

    @GetMapping("/getTeacher")
    public Iterable<Teacher> getDetails() {
        return teachService.getDetails();
    }

    @GetMapping("/getTeacher/cls/{cls}")
    public List<Teacher>getTeacherByCls(@PathVariable String cls){
        return teachService.getTeacherByCls(cls);
    }

    @DeleteMapping("/{id}")
    public String deleteTeacher(@PathVariable int id) {

        boolean deleted = teachService.deleteTeacher(id);

        if (deleted) {
            return "Teacher with ID " + id + " deleted successfully!";
        } else {
            return "Teacher with ID " + id + " not found!";
        }
    }
}
