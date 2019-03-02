package com.github.eciuca.sda.mywebapp.services;

import com.github.eciuca.sda.mywebapp.model.Client;

import java.util.List;

public interface ClientService {

    List<Client> getAllClients();

    Client createClient(String firstName, String lastName);

    void deleteClient(Long id);
}
