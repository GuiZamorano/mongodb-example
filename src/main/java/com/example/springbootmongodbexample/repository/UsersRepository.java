package com.example.springbootmongodbexample.repository;

import com.example.springbootmongodbexample.documents.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users, Integer>{
}
