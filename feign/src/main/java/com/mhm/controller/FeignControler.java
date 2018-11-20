package com.mhm.controller;

import com.mhm.feignInterface.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MaHuiming on 2018/11/19.
 */
@RestController
public class FeignControler {

    @Value("${server.port}")
    String port;

    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/eureka",method = RequestMethod.GET)
    public String index(@RequestParam String name){
        return feignService.index(name);
    }

    @RequestMapping(value="/get")
    public String index() {
        return "index："+port;
    }
}
