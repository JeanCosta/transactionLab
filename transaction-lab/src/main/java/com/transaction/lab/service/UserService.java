package com.transaction.lab.service;

import com.transaction.lab.VO.UserVO;
import com.transaction.lab.entity.UserEntity;

/**
 * Created by jean on 3/15/16.
 */
public interface UserService {

    UserEntity getUserById(final Long id);

    UserEntity createUser(final UserVO userVO);
}
