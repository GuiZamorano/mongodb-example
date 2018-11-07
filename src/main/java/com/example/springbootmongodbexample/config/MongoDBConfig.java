package com.example.springbootmongodbexample.config;

import com.example.springbootmongodbexample.documents.Users;
import com.example.springbootmongodbexample.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UsersRepository usersRepository) {
        return strings -> {
            usersRepository.save(new Users(1, "Gui", 1));
            usersRepository.save(new Users(2, "Student 2", 2));
        };
    }
}
