package com.nihui.bean;

/**
 * @Classname Person
 * @Description TODO
 * @Date 2019/9/24 3:49 PM
 * @Created by nihui
 */
public class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
