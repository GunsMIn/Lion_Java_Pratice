package com.company.day06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {


    //map을 사용한 최댓값과 순서구하기 key value
    public String solutions(int[] arr) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > max) {
                max=key;
            }
        }
        answer = "값 :" + max + "," + map.get(max) + "번째 수";
        return answer;
    }


    //단순 최대값구하기
    public int solution(int[] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        answer = max;
        return answer;
    }


    public static void main(String[] args) {
        Main1 m = new Main1();
/*        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }*/

        int[] arr = {3, 29, 38, 12, 57, 74, 40, 85, 61};
        System.out.println(m.solutions(arr));









    }
}
