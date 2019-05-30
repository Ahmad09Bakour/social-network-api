package org.fasttrackit.socialnetworkapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.fasttrackit.socialnetworkapi.domain.User;
import org.fasttrackit.socialnetworkapi.persistence.UserRepository;
import org.fasttrackit.socialnetworkapi.transfer.CreateUserRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    private final UserRepository userRepository;

    private final ObjectMapper objectMapper;

    @Autowired
    public UserService(UserRepository userRepository, ObjectMapper objectMapper) {
        this.userRepository = userRepository;
        this.objectMapper = objectMapper;
    }

    public User createUser (CreateUserRequest request){
        LOGGER.info("Creating User {}" + request);
        User user = objectMapper.convertValue(request, User.class);

        return userRepository.save(user);
    }
}
