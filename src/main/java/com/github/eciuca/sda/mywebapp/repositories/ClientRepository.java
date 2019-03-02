package com.github.eciuca.sda.mywebapp.repositories;

import com.github.eciuca.sda.mywebapp.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query(value = "SELECT c FROM clients c WHERE c.name = :name")
    List<Client> findAllByName(String name);
}
