package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Component
@Scope(value = SCOPE_PROTOTYPE)
public class GreetingService {

    public GreetingService() {
        System.out.println("---------new greetingService bean---------");
    }

    String sayHi() {
        return "hello world";
    }
}
