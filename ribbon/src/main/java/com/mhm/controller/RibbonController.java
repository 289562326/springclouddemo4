package com.mhm.controller;

import com.mhm.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MaHuiming on 2018/11/14.
 */
@RestController
public class RibbonController {
    @Value("${server.port}")
    String port;
    @Autowired
    private RibbonService ribbonService;
    @RequestMapping(value="/ribbon", method = RequestMethod.GET)
    public String ribbon(@RequestParam String name){
        return ribbonService.ribbonService(name);
    }

    @RequestMapping(value="/get")
    public String index() {
        return "index："+port;
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String login() {
        return "hi post";
    }
}
