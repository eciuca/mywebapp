package com.github.eciuca.sda.mywebapp.controllers.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class NewClientFormDto {

    public static final String NEW_CLIENT_FORM = "newClientForm";

    private String firstName;
    private String lastName;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate dateOfBirth;

    public NewClientFormDto() {
        this.dateOfBirth = LocalDate.now();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
