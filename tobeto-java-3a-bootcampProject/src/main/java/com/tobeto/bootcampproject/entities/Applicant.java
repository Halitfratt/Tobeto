package com.tobeto.bootcampproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "applicants")
@EqualsAndHashCode(callSuper = true)
public class Applicant extends User<Integer>{

    @Column(name = "name")
    private String about;

    @ManyToOne
    @JoinColumn(name = "instructorId")
    private Instructor instructor;
}
