package org.spring.mybatis.service;


import org.spring.mybatis.dto.UserDto;
import org.spring.mybatis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public void insert(UserDto userDto){
        userRepository.userInsert(userDto);
    }

    public void insert2(UserDto userDto){
        userRepository.userInsert2(userDto);
    }


    public List<UserDto> userlist() {
        List<UserDto> list  = userRepository.userList();
        return list;

    }
}
