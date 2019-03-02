package com.github.eciuca.sda.mywebapp.services;

import com.github.eciuca.sda.mywebapp.model.Client;
import com.github.eciuca.sda.mywebapp.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client createClient(String firstName, String lastName) {
        Client client = new Client();

        client.setFirstName(firstName);
        client.setLastName(lastName);

        return clientRepository.save(client);
    }
}
