package com.transaction.lab.service;

import com.transaction.lab.VO.UserVO;
import com.transaction.lab.entity.UserEntity;
import com.transaction.lab.repository.UserRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jean on 3/15/16.
 */

@Service
public class UserServiceImpl implements UserService {

    private static Logger logger = Logger.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepository userRepository;

    @Override

    public UserEntity getUserById(final Long id) {
        return userRepository.findById(id);
    }

    @Override
    public UserEntity createUser(final UserVO userVO) {
        return userRepository.save(userVO.toEntity());
    }

}
