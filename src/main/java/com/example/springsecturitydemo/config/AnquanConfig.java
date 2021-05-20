package com.example.springsecturitydemo.config;

import org.springframework.context.annotation.Bean;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@EnableWebMvcSecurity
public class AnquanConfig extends WebSecurityConfigurerAdapter {


    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("root").password("123456").authorities("/");
    }

    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/**").fullyAuthenticated().and().httpBasic();
    }
    @Bean
    public static PasswordEncoder passwordEncoder(){

        PasswordEncoder instance = NoOpPasswordEncoder.getInstance();
        return (instance);
    }

}
