package com.nihui.foreach;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname ForEachList
 * @Description TODO
 * @Date 2019/9/24 3:30 PM
 * @Created by nihui
 */
public class ForEachList {

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();

        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");
        items.add("F");

        for (String item: items) {
            System.out.println(item);
        }




        items.forEach(item-> System.out.println(item));


        items.forEach(item->{
            if ("C".equals(item)){
                System.out.println(item);
            }
        });

        items.forEach(System.out::println);

        items.stream().filter(s->s.contains("B")).forEach(System.out::println);

    }
}
