package com.example.BookMyShow.Repository;

import com.example.BookMyShow.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface UserRepository extends JpaRepository<User,Integer> {
    }

