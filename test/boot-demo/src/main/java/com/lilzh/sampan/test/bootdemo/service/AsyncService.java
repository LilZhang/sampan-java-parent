package com.lilzh.sampan.test.bootdemo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    @Async
    public void asyncPrint() {
        System.err.println(Thread.currentThread().getName());
    }

}
