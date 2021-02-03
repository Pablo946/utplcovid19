package com.utpl.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utpl.entity.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Serializable>{

    User findByUserName(String userName);

}
