package com.tobeto.bootcampproject.core.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "APPLICANTS")
@EqualsAndHashCode(callSuper = true)
public class Applicant extends User {

    @Column(name = "ABOUT")
    private String about;
}
