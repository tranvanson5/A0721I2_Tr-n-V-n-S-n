package com.example.validate_register.repository;


import com.example.validate_register.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

    Page<User> searchAllByOrFistnameContainingOrLastnameContainingOrNumberphoneContainsOrEmailContainingOrAge(String trim, String trim1, String trim2, String trim3,int age,Pageable pageable);
}
