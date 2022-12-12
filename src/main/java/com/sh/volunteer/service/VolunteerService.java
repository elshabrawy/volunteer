package com.sh.volunteer.service;

import com.sh.volunteer.model.Volunteer;
import com.sh.volunteer.repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteerService {
    @Autowired
    VolunteerRepository volunteerRepository;

    public void registerVolunteer(Volunteer volunteer){
        volunteerRepository.save(volunteer);
    }
    public List<Volunteer> getAllVolunteers(){
        return volunteerRepository.findAll();
    }
}
