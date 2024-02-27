package com.tobeto.bootcampproject.dataaccess.abstracts;

import com.tobeto.bootcampproject.core.entities.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Integer> {
}
