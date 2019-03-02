package com.github.eciuca.sda.mywebapp.controllers.dto;

public class NewClientFormDto {

    public static final String NEW_CLIENT_FORM = "newClientForm";

    private String firstName;
    private String lastName;

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
}
