package com.github.eciuca.sda.mywebapp.controllers;

import com.github.eciuca.sda.mywebapp.model.Client;
import com.github.eciuca.sda.mywebapp.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClientsController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/clients")
    public String showClients(Model model) {
        List<Client> list = clientService.damiTotiClientii();

        model.addAttribute("clientsList", list);
        model.addAttribute("companyName", "My company");

        return "clients";
    }
}
