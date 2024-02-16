package com.tobeto.bootcampproject.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "employees")
@EqualsAndHashCode(callSuper = true)
public class Employee extends User<Integer>{

    @Column(name = "position")
    private String position;

    @OneToMany(mappedBy = "employee")
    private List<Instructor> instructors;
}
