package com.github.eciuca.sda.mywebapp.controllers.dto;

public class DeleteClientFormDto {

    public static final String DELETE_CLIENT_FORM = "deleteClientForm";

    private Long clientId;

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
}
