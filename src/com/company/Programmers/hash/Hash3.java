package com.company.Programmers.hash;


import java.util.HashMap;
import java.util.Map;

public class Hash3 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42577?language=java
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, Integer> map = new HashMap<>(); //해싱하려고
        for (String number : phone_book) {
            map.put(number, 1);
        }

        for (int i = 0; i < phone_book.length; i++) { // phoneBook만큼 반복을 돌릴 것이다.
            for (int j = 1; j < phone_book[i].length() ; j++) { //map에 들어가있는 key의 글자수만큼
                if (map.containsKey(phone_book[i].substring(0, j))) {
                    answer = false;
                }
            }

        }
        return answer;
    }


    public boolean solution2(String[] phoneBook) {
        boolean answer = true;
        Map<String, Integer> map = new HashMap<>();

        for (String phoneNum : phoneBook) {
            map.put(phoneNum, 1);
        }
        for (int i = 0; i < phoneBook.length; i++) {
            for (int j = 1; j < phoneBook[i].length(); j++) {
                boolean check = map.containsKey(phoneBook[i].substring(0, j));
                if (check) {
                    answer = false;
                }
            }
        }




        return answer;
    }



}
