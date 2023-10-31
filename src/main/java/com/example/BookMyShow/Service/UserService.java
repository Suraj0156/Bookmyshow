package com.example.BookMyShow.Service;

import com.example.BookMyShow.Models.User;
import com.example.BookMyShow.Repository.UserRepository;
import com.example.BookMyShow.RequestDtos.AddUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String addUser(AddUserRequest addUserRequest) {
//
        User userobj=User.builder()
                        .age(addUserRequest.getAge())
                         .emailId(addUserRequest.getEmailId())
                          .mobNo(addUserRequest.getMobNo())
                           .name(addUserRequest.getName())
                           .build();
        userRepository.save(userobj);
        return "User added successfully";
    }


}