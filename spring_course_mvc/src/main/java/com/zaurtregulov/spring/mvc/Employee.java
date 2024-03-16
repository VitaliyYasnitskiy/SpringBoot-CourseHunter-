package com.zaurtregulov.spring.mvc;
import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min=2, max=10, message ="name must be min 2 symbols")
    private String name;
//    @NotNull(message ="surname is required field")
//    @NotEmpty(message ="surname is required field")
    @NotBlank(message ="surname is required field")

    private String surname;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;


    private String[] languages;
    private Map<String,String> languageList;

    @Pattern(regexp="\\d{3}-\\d{2}-\\d{2}",message="Please use pattern XXX-XX-XX")
    private String phoneNumber;




@Min(value = 50, message ="must be greater than 500")
@Max(value = 900, message ="must be less than 900")
    private int salary;
    private String department;

    public Employee() {

        departments = new HashMap<>();
        departments.put("IT","Information Technology");
        departments.put("HR","Human Resourses");
        departments.put("Sales","Sales");
        carBrands =  new HashMap<>();
        carBrands.put("BMW","BMW");
        carBrands.put("Audi","Audi");
        carBrands.put("Mersedes-Benz","MB");

        languageList = new HashMap<>();
        languageList.put("English","En");
        languageList.put("Deutch","De");
        languageList.put("Franch","Fr");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
