package com.company.Programmers.sort;

import java.util.Arrays;

public class Solution1 {

    //https://school.programmers.co.kr/learn/courses/30/lessons/42748

        public int[] sol(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            for (int i = 0; i < commands.length; i++) {
                int a, b, c;
                a= commands[i][0]; // 2
                b= commands[i][1]; // 5
                c= commands[i][2]; // 3
                int[] tmp = Arrays.copyOfRange(array, a - 1, b);

                Arrays.sort(tmp);
                answer[i] = tmp[c - 1];
            }
            return answer;
        }






}
