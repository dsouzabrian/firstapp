package com.learning.firstapp.service;

import com.learning.firstapp.dto.UserDTO;
import com.learning.firstapp.model.User;
import com.learning.firstapp.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

   public UserDTO register(UserDTO userDTO){
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());

        userRepository.save(user);
        return userDTO;
   }

    public UserDTO check(UserDTO userDTO){
        User user = userRepository.findByUsername(userDTO.getUsername());
        UserDTO getUserDTO = new UserDTO();
        getUserDTO.setUsername(user.getUsername());
        getUserDTO.setEmail(user.getEmail());
        getUserDTO.setPassword(user.getPassword());
        return getUserDTO;
    }

}
