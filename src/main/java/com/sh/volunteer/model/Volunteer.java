package com.sh.volunteer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Volunteer {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private Long phone;
    private int rate;
    private double pricePerHour;
    private int age;
    private boolean verified;

}
