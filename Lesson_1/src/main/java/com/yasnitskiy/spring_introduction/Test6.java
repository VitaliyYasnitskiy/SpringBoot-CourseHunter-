package com.yasnitskiy.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(MyConfig.class);
//        Pet cat1 = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
        //cat.say();


                Person person = context.getBean("personBean", Person.class);
        Person person2 = context.getBean("personBean", Person.class);
//                person2.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();

    }
}
