package com.Springpro.Springpro.Teacher.Entity;

import com.Springpro.Springpro.Student.Entity.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "teach_info")
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    @Id
    @Column(name = "teach_id")
    private int teach_id;

    @Column(name = "teach_name")
    private String teach_name;

    @Column(name = "age")
    private int age;

    @Column(name = "subject")
    private String subject;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Student> students;

}
