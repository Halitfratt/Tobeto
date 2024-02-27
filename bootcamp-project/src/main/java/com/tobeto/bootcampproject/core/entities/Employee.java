package com.tobeto.bootcampproject.core.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data //tercih edilmez. gettter ve setterı kullan.
@NoArgsConstructor  //parametresiz cons oluşturur.
@AllArgsConstructor
@Entity
@Table(name = "EMPLOYEES")
@EqualsAndHashCode(callSuper = true)
public class Employee extends User {
    @Column(name = "POSITION")
    private String position;
    //test
}
