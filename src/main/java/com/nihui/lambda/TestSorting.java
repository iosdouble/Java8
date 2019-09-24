package com.nihui.lambda;

import com.nihui.bean.Developer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Classname TestSorting
 * @Description TODO
 * @Date 2019/9/24 1:49 PM
 * @Created by nihui
 */
public class TestSorting {
    public static void main(String[] args) {

        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        //通过名age排序
        Collections.sort(listDevs, new Comparator<Developer>() {
            public int compare(Developer o1, Developer o2) {
                return o1.getAge() - o2.getAge();
            }
        });



        //通过age排序
        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        //通过name排序
        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //通过Salary来排序
        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getBigDecimal().compareTo(o2.getBigDecimal());
            }
        });

        //使用Lambda表达式
//        Comparator<Developer> byName = (Developer o1,Developer o2)->o1.getName().compareTo(o2.getName());


        System.out.println("After Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

    }

    private static List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<Developer>();

        result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        result.add(new Developer("alvin", new BigDecimal("80000"), 20));
        result.add(new Developer("jason", new BigDecimal("100000"), 10));
        result.add(new Developer("iris", new BigDecimal("170000"), 55));

        return result;

    }
}
