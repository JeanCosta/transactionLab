package com.transaction.lab.service;

import com.transaction.lab.entity.UserEntity;

/**
 * Created by jean on 3/18/16.
 */
public interface CustomRepositoryService {

    UserEntity findUserById(final Long id);

}
