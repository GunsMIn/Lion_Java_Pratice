package com.company.Programmers.sort.online;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(50));
        }

       list.sort(new Comparator<Integer>() {
           //오름차순정렬
           @Override
           public int compare(Integer o1, Integer o2) { // o1-o2
               return o1.intValue()-o2.intValue(); // 리턴이 양수면 왼쪽것이크다 리턴이 음수이면 오른쪽이크다 0이면 같다
           }
       });



        System.out.println(list);

    }



}
