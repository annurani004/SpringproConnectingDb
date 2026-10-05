package com.Springpro.Springpro.Teacher.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "teach_info")
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "cls")
    private int cls;

    @Column(name = "name")
    private String name;

    @Column(name = "subject")
    private String subject;

}
