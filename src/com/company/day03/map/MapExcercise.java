package com.company.day03.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExcercise {


    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        //TreeMap<String, String> tree = new TreeMap<>();

        int m = 0;
        int w = 0;

        map.put("김건우", "남");
        map.put("김경록", "남");
        map.put("박수경", "여");
        map.put("오경숙", "여");
        map.put("오미자", "여");


        for (String key : map.keySet()) {
            if (map.get(key) == "남") {
                m++;
            }else{
                w++;
            }
        }
        System.out.println("m = " + m);
        System.out.println("w = " + w);

        System.out.println(map.get("김건우"));



    }
}
