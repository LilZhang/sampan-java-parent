package com.lilzh.sampan.test.bootdemo.controller;

import com.lilzh.sampan.test.bootdemo.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sampan")
public class HelloController {

    @Autowired
    private Environment env;

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/hello")
    public String hello() {
        System.out.println("[HelloController] sampan invoke hello");
        this.asyncService.asyncPrint();
        return "sampan hello at " + this.env.getProperty("server.port");
    }
}
