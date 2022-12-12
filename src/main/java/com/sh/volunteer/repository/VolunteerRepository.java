package com.sh.volunteer.repository;

import com.sh.volunteer.model.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolunteerRepository extends JpaRepository <Volunteer,Long>{
}
