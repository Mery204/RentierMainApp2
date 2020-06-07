package com.rentier.rentierapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
        public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;


    @Override
    protected void configure (HttpSecurity http) throws Exception{
        http.formLogin().and().authorizeRequests()
                .antMatchers(HttpMethod.GET, "/landlord/list").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.GET, "/landlord/add").hasAnyAuthority("ROLE_USER")
                .anyRequest().permitAll();
    }

    @Override
    protected void configure (HttpSecurity http) throws Exception{
        http.formLogin().and().authorizeRequests()
                .antMatchers(HttpMethod.GET, "/tenant/list").hasAnyAuthority( "ROLE_USER")
                .antMatchers(HttpMethod.GET, "/tenant/add").hasAuthority("ROLE_USER")
                .anyRequest().permitAll();
    }



}