package com.company.day03.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExcercise3 {


    public static void main(String[] args) {

        String repo = "https://github.com/dongyeon-0822/java-project-exercise";

        Map<Character, Integer> alphabetMap = new HashMap<>();

        for (char c : repo.toCharArray()) {
            c = Character.toLowerCase(c);
            if (Character.isAlphabetic(c)) {
                alphabetMap.put(c, alphabetMap.getOrDefault(c, 0) + 1);
            }
        }


        Set<Map.Entry<Character, Integer>> alpabetset = alphabetMap.entrySet();
        for (Map.Entry<Character, Integer> each : alpabetset) {
            System.out.println("알파벳"+each.getKey()+":"+each.getValue()+"개");

        }


       



    }
}
