package com.example.validate_register.repository;


import com.example.validate_register.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
    Page<User> searchAllByOrFistnameContainingOrLastnameContainingOrNumberphoneContainsOrEmailContaining(
            String fistname,
            String lastname,
            String numberphone,
            String email,
            Pageable pageable
    );
}
