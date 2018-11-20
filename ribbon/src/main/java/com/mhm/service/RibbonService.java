package com.mhm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by MaHuiming on 2018/11/14.
 */
@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    public String ribbonService(String name){
        return restTemplate.getForObject("http://EUREKA-CLIENT/eureka?name="+name,String.class);
    }
}
