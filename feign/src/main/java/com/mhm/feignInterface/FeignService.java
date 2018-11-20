package com.mhm.feignInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by MHm on 2018/11/19.
 */
@FeignClient(value = "eureka-client")
public interface FeignService {
    @RequestMapping(value="/eureka",method = RequestMethod.GET)
    String index(@RequestParam(value = "name") String name);
}