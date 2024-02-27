package com.tobeto.bootcampproject.dataaccess.abstracts;

import com.tobeto.bootcampproject.core.entities.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant,Integer> {
}
