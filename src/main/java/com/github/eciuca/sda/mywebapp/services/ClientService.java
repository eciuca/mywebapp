package com.github.eciuca.sda.mywebapp.services;

import com.github.eciuca.sda.mywebapp.model.Client;

import java.time.LocalDate;
import java.util.List;

public interface ClientService {

    List<Client> getAllClients();

    Client createClient(String firstName, String lastName, LocalDate dateOfBirth);

    void deleteClient(Long id);
}
