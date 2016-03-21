package com.transaction.lab.service;

import com.transaction.lab.entity.UserEntity;
import com.transaction.lab.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jean on 3/18/16.
 */
@Service
public class CustomRepositoryServiceImpl implements CustomRepositoryService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserEntity findUserById(Long id) {
        return userRepository.findById(id);
    }
}
