package com.mhm.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MHm on 2018/11/16.
 */
@RestController
public class GetController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value="/eureka")
    public String index() {
        return "index："+port;
    }
}
