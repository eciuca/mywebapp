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

    public List<Client> damiTotiClientii() {
        return clientRepository.findAll();
    }
}
