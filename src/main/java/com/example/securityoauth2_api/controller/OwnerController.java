package com.example.securityoauth2_api.controller;

import com.example.securityoauth2_api.repo.OwnerRepository;
import com.example.securityoauth2_api.entity.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class OwnerController {

    @Autowired
    private OwnerRepository repository;

    @GetMapping("/users")
    public List<Owner> findAllUser(){
        return repository.findAll();
    }

    @GetMapping("/user")
    public Owner findById(Long id){
        return repository.findById(id).get();
    }
}