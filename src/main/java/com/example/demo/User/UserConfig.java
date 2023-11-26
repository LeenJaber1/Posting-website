package com.example.demo.User;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args -> {
            UserInfo leen = new UserInfo( "jaberleen95@gmail.com" , "helloworld");

            repository.save(leen);
        };

    }
    //when a user log in or signs up here would be the object of the user
}
