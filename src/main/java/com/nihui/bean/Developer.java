package com.nihui.bean;

import java.math.BigDecimal;

/**
 * @Classname Developer
 * @Description TODO
 * @Date 2019/9/24 1:50 PM
 * @Created by nihui
 */
public class Developer {
    private String name;
    private BigDecimal bigDecimal;
    private Integer age;

    public Developer(String name, BigDecimal bigDecimal, Integer age) {
        this.name = name;
        this.bigDecimal = bigDecimal;
        this.age = age;
    }


    public Developer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", bigDecimal=" + bigDecimal +
                ", age=" + age +
                '}';
    }
}
