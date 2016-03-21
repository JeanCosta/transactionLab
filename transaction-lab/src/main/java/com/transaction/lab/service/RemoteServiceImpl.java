package com.transaction.lab.service;

import com.transaction.lab.VO.RemoteVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jean on 3/18/16.
 */
@Service
public class RemoteServiceImpl implements RemoteService {

    private static Logger logger = Logger.getLogger(RemoteServiceImpl.class);

    @Autowired
    RestTemplate restTemplate;

    @Override
    public RemoteVO callRemote() {

        RemoteVO remoteVO = null;
        try {
            remoteVO = restTemplate.getForObject("http://localhost:8090", RemoteVO.class);
        }catch(Exception e){
            e.getMessage();
        }

        return remoteVO;
    }
}
