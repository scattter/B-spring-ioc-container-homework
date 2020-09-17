package com.thoughtworks.capability.demospringioccontainer.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String sayHi() {
        return "hello world";
    }
}
