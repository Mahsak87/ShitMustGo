package com.helpwithrecycling.helpwithrecycling.service;

import com.helpwithrecycling.helpwithrecycling.data.entity.Users;
import com.helpwithrecycling.helpwithrecycling.data.repository.UsersRepository;
import org.springframework.stereotype.Service;

@Service
public record UsersService(UsersRepository usersRepository) {

    public boolean hasId(final long id) {
        return usersRepository.existsById(id);
    }

    public Users byLoginInfo(final String email , final String password) {
        return usersRepository.findByEmailAndPassword(email , password);
    }
}
