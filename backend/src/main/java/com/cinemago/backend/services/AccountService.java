package com.cinemago.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemago.backend.entities.Account;
import com.cinemago.backend.repositories.AccountRepository;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public void saveUser(Account account) {
        accountRepository.save(account);
    }

    
}
