package com.yasnitskiy.spring_introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Component;

//@Component
// дефолтный бин-id dog
//@Scope("prototype")
public class Dog implements Pet {
    //private String name;

    public Dog() {System.out.println("Dog bean created");}
    @Override
    public void say () {
            System.out.println("bow-bow");
        }

//    @PostConstruct
//    protected void init(){System.out.println("Class dog init metod");}
//    @PreDestroy
//    protected void destroy(){System.out.println("Class dog init destroy metod");}


//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
