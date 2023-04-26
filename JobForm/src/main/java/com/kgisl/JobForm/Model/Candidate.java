package com.kgisl.JobForm.Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "candidates")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "phone")
    private String phone;
    
    @Column(name = "address")
    private String address;
    
    @Column(name = "education_level")
    private String educationLevel;
    
    @Column(name = "major")
    private String major;
    
    @Column(name = "graduation_date")
    private LocalDate graduationDate;
    
    @Column(name = "work_availability")
    private String workAvailability;
    
    @Column(name = "desired_position")
    private String desiredPosition;
    
    @Column(name = "previous_experience")
    private String previousExperience;
    
    @Column(name = "references")
    private String references;
    
    @Column(name = "skills")
    private String skills;
    
    @Column(name = "availability_for_interview")
    private LocalDate availabilityForInterview;
    
    @Column(name = "date_of_application")
    private LocalDate dateOfApplication;
    
    @Column(name = "resume_link")
    private String resumeLink;

    public Candidate(Long id, String name, String email, String phone, String address, String educationLevel,
            String major, LocalDate graduationDate, String workAvailability, String desiredPosition,
            String previousExperience, String references, String skills, LocalDate availabilityForInterview,
            LocalDate dateOfApplication, String resumeLink) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.educationLevel = educationLevel;
        this.major = major;
        this.graduationDate = graduationDate;
        this.workAvailability = workAvailability;
        this.desiredPosition = desiredPosition;
        this.previousExperience = previousExperience;
        this.references = references;
        this.skills = skills;
        this.availabilityForInterview = availabilityForInterview;
        this.dateOfApplication = dateOfApplication;
        this.resumeLink = resumeLink;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getWorkAvailability() {
        return workAvailability;
    }

    public void setWorkAvailability(String workAvailability) {
        this.workAvailability = workAvailability;
    }

    public String getDesiredPosition() {
        return desiredPosition;
    }

    public void setDesiredPosition(String desiredPosition) {
        this.desiredPosition = desiredPosition;
    }

    public String getPreviousExperience() {
        return previousExperience;
    }

    public void setPreviousExperience(String previousExperience) {
        this.previousExperience = previousExperience;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public LocalDate getAvailabilityForInterview() {
        return availabilityForInterview;
    }

    public void setAvailabilityForInterview(LocalDate availabilityForInterview) {
        this.availabilityForInterview = availabilityForInterview;
    }

    public LocalDate getDateOfApplication() {
        return dateOfApplication;
    }

    public void setDateOfApplication(LocalDate dateOfApplication) {
        this.dateOfApplication = dateOfApplication;
    }

    public String getResumeLink() {
        return resumeLink;
    }

    public void setResumeLink(String resumeLink) {
        this.resumeLink = resumeLink;
    }

    // Constructors, getters and setters


    
}
