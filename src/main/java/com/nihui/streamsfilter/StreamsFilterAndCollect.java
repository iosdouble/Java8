package com.nihui.streamsfilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Classname StreamsFilterAndCollect
 * @Description TODO
 * @Date 2019/9/24 3:40 PM
 * @Created by nihui
 */
public class StreamsFilterAndCollect {
    public static void main(String[] args) {

        List<String> lines = Arrays.asList("Spring","Node","NiHui");
        List<String> result = getFilterOutput(lines,"NiHui");
        for (String temp:result) {
            System.out.println(temp);
        }


        //Java8

        List<String> result8 = lines.stream().filter(line->!"NiHui".equals(line))
                .collect(Collectors.toList());

        result8.forEach(System.out::println);

    }

    private static List<String> getFilterOutput(List<String> lines,String filter){
        List<String> result = new ArrayList<>();
        for (String line: lines) {
            if (!"NiHui".equals(line)){
                result.add(line);
            }
        }
        return result;
    }
}
