// создаем класс из bean
// мы нигде сами не создаем class dog, это делает сам spring
package com.yasnitskiy.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
       // String configLocation;
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class); // так вызываем bean, указав его имя myPet
        pet.say();
        context.close();
    }

}
