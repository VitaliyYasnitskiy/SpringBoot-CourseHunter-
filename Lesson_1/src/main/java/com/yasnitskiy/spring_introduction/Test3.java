// ref - это ссылка на другой  bean id
// constructor-arg  это аргумент конструктора
package com.yasnitskiy.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //Pet pet = context.getBean("myPet", Pet.class);

        //Pet pet = new Dog();  // Мы могли добавить объект через создание класса, но сделаем это через bean
        //Person person = new Person(pet);
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();



    }
}
