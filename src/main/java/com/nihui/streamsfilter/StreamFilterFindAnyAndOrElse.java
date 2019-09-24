package com.nihui.streamsfilter;

import com.nihui.bean.Person;

import java.util.Arrays;
import java.util.List;

/**
 * @Classname StreamFilterFindAnyAndOrElse
 * @Description TODO
 * @Date 2019/9/24 3:49 PM
 * @Created by nihui
 */
public class StreamFilterFindAnyAndOrElse {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("nihui",23),
                new Person("tom",2),
                new Person("jerry",1)
        );


        Person result = getStudentByName(persons, "nihui");
        System.out.println(result);

        //Java8

        Person result1 = persons.stream()                        // 转化为流
                .filter(x -> "jack".equals(x.getName()))        // 只过滤出"jack"
                .findAny()                                      // 如果找到了就返回
                .orElse(null);                                  // 如果找不到就返回null

        System.out.println(result1);

        Person result2 = persons.stream()
                .filter(x -> "ahmook".equals(x.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result2);


    }

    private static Person getStudentByName(List<Person> persons, String name) {

        Person result = null;
        for (Person temp : persons) {
            if (name.equals(temp.getName())) {
                result = temp;
            }
        }
        return result;
    }
}
