package com.company.day03.map;

import com.sun.source.tree.NewArrayTree;

public class MapExcercise4 {

    public boolean isAlpabet(String str) {
        boolean answer = false;
        for (char c : str.toCharArray()) {
            if ((c >= 65 && c <= 90) || (c>=97 && c<=122)) {
                answer = true;
            }else{
                answer =false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        MapExcercise4 ex = new MapExcercise4();
        System.out.println(ex.isAlpabet("asd32"));



    }
}
