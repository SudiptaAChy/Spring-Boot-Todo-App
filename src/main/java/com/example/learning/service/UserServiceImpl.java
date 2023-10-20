package com.example.learning.service;

import com.example.learning.entity.Accounts;
import com.example.learning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public Accounts saveUser(Accounts accounts) {
        return repository.save(accounts);
    }
}
