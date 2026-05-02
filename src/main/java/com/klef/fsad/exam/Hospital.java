package com.klef.fsad.exam;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "hospital")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private LocalDate date;
    private String status;
    private String location;
    private String contactNumber;
    private String hospitalType;
    private int totalBeds;
    private String email;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String n) { this.contactNumber = n; }

    public String getHospitalType() { return hospitalType; }
    public void setHospitalType(String t) { this.hospitalType = t; }

    public int getTotalBeds() { return totalBeds; }
    public void setTotalBeds(int totalBeds) { this.totalBeds = totalBeds; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "\n====== Hospital Record ======" +
               "\nID          : " + id +
               "\nName        : " + name +
               "\nDescription : " + description +
               "\nDate        : " + date +
               "\nStatus      : " + status +
               "\nLocation    : " + location +
               "\nContact     : " + contactNumber +
               "\nType        : " + hospitalType +
               "\nTotal Beds  : " + totalBeds +
               "\nEmail       : " + email +
               "\n=============================";
    }
}