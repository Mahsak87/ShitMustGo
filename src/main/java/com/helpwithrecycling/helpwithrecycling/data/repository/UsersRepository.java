package com.helpwithrecycling.helpwithrecycling.data.repository;

import com.helpwithrecycling.helpwithrecycling.data.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    List<Users> findAllBy();

    Users findById(final long id);

// hittar via email och password som kan ändras
    Users findByEmailAndPassword(final String email , final String password);
    Users findByLastName(final String Lastname);

    Users findByEmail(final String email);
}
