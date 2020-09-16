package com.thoughtworks.capability.demospringioccontainer;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

//    private final GreetingService greetingService;
//
//    @Autowired
//    public GreetingController(@Lazy GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }

    @Autowired
    private BeanFactory beanFactory;

    @GetMapping("/greet")
    public String greet() {
        GreetingService greetingService = beanFactory.getBean(GreetingService.class);
        return greetingService.sayHi();
    }

}
