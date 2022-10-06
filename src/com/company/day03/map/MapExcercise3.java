package com.company.day03.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExcercise3 {


    public boolean isAlpabe(String str) {
        boolean answer = false;
        for (char c : str.toCharArray()) {
            if ((c >= 65 && c <= 90) || (c>=97 && c<=122)) {
              answer = true;
            }
        }
        return answer;
    }


    public static void main(String[] args) {

        String repo = "https://github.com/dongyeon-0822/java-project-exercise";

        Map<Character, Integer> alphabetMap = new HashMap<>();

        for (char c : repo.toCharArray()) {
            c = Character.toLowerCase(c);
            if (Character.isAlphabetic(c)) {
                alphabetMap.put(c, alphabetMap.getOrDefault(c, 0) + 1);
            }
        }

        //key를 하나씩 가져오려고
        Set<Map.Entry<Character, Integer>> alpabetSet = alphabetMap.entrySet();

        for (Map.Entry<Character, Integer> eachAlpabet : alpabetSet) {
            System.out.println("알파벳"+eachAlpabet.getKey()+":"+eachAlpabet.getValue()+"개");
        }






    }
}
