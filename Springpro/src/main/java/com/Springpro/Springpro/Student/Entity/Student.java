package com.Springpro.Springpro.Student.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "st_info")
public class Student {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "marks")
    private int marks;

    @Column(name = "name")
    private String name;
}
