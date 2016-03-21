package com.transaction.lab.repository;

import com.transaction.lab.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jean on 3/15/16.
 */
@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long> {

    UserEntity findById(final Long id);
}
