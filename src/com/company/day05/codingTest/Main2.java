package com.company.day05.codingTest;

import java.util.Scanner;

public class Main2 {


    //자릿수 구하기
    //7 -> 1
    //12 -> 2
    // 1234 -> 4자리수
    public int solution(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }


    public static void main(String[] args) {

        Main2 m = new Main2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(m.solution(n));
    }
}
