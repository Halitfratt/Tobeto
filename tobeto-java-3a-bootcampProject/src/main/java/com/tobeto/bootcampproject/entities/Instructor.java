package com.tobeto.bootcampproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "instructors")
@EqualsAndHashCode(callSuper = true)
public class Instructor extends User<Integer> {

    @Column(name = "companyName")
    private String companyName;

    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;

    @OneToMany(mappedBy = "instructor")
    private List<Applicant> applicants;
}
