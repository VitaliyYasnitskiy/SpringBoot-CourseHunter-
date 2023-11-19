package com.yasnitskiy.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
  //  @Autowired
   // @Qualifier("dog")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        System.out.println("Class Person: is created");
//        this.pet = pet;
//    }


    public Person(Pet pet){
        System.out.println("Person bean is created");
        this.pet=pet;
    }


//    public Person() {
//        System.out.println(" Person bean is created");
//    }

    //@Autowired
    // Как происходит конвертация pet --> setPet:
    // p --> P
    // далее setPet и p --> P
    public void setPet(Pet pet){
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }
    public void callYourPet(){
        System.out.println("Hello, my lowely Pet");
        pet.say();
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        System.out.println("Class person: set surname");
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Class person: set age");
    }


}
