package com.yasnitskiy.spring_introduction;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan("com.yasnitskiy.spring_introduction")
@PropertySource("classpath:myApp.properties")
public class MyConfig {
    @Bean
    @Scope("singleton")

    public Pet catBean(){
        return new Cat();
    }
@Bean
    public Person personBean(){
        return new Person(catBean());

}
}
