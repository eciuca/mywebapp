package com.github.eciuca.sda.mywebapp.auth;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // disable csrf to be able to send POST requests
                .authorizeRequests()
                .antMatchers("/**") // match all urls
                .permitAll(); // allow all matched urls
    }
}
