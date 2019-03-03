package com.github.eciuca.sda.mywebapp.auth.repositories;

import com.github.eciuca.sda.mywebapp.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
