package com.transaction.lab.controllers;

import com.transaction.lab.VO.RemoteVO;
import com.transaction.lab.entity.UserEntity;
import com.transaction.lab.service.RemoteService;
import com.transaction.lab.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jean on 3/15/16.
 */
@RestController
@RequestMapping("user")
public class UserController {

    private static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @Autowired
    RemoteService remoteService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserEntity getUserById(@PathVariable("id") final Long id) {

        UserEntity user = userService.getUserById(id);
        logger.info("\n\n ## query executada ## \n\n");
        RemoteVO remoteVo = remoteService.callRemote();
        logger.info("\n\n ## Chamada remota realizada ## \n\n");

        return user;
    }

}
