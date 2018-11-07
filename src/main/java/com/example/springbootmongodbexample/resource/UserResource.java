package com.example.springbootmongodbexample.resource;

import com.example.springbootmongodbexample.documents.Users;
import com.example.springbootmongodbexample.repository.UsersRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserResource {

    private UsersRepository usersRepository;

    public UserResource(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    @GetMapping("/all")
    public List<Users> getAll(){
        return usersRepository.findAll();
    }

}
