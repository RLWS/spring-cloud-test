package com.rlws.cloud.eureka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rlws
 * @date 2020/1/7  16:34
 */
@RestController
public class IndexController {

    @RequestMapping(value = "index")
    public String index(){
        return "nihao";
    }
}
