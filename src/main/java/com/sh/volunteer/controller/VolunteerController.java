package com.sh.volunteer.controller;

import com.sh.volunteer.model.Volunteer;
import com.sh.volunteer.service.VolunteerService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping({"api/volunteer"})
public class VolunteerController {
    @Autowired
    private VolunteerService volunteerService ;

    @PostMapping({"/register"})
    public void registerVolunteer(@RequestBody Volunteer volunteer) {
        volunteerService.registerVolunteer( volunteer);
    }

    @GetMapping({"/volunteers"})
    public List<Volunteer> getVolunteers() {
        CompletableFuture<List<Volunteer>> listCompletableFuture = CompletableFuture.supplyAsync(() -> volunteerService.getAllVolunteers());
        List<Volunteer> volunteerList = listCompletableFuture.join();
        return this.volunteerService.getAllVolunteers();
    }

}
