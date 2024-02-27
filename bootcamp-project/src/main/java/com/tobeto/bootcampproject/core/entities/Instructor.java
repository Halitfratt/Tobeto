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
@Table(name = "INSTRUCTORS")
@EqualsAndHashCode(callSuper = true)
public class Instructor extends User {
    @Column(name = "COMPANY_NAME")
    private String companyName;
}
