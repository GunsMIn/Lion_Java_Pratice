package com.company.day05.codingTest;

import java.util.Scanner;

public class TeacherMain {
    public int solution(int n) {
        int result = 0;
        int origin = n;
        while (origin > 0) {
            result += origin % 10; // 나머지를 먼저 구할 것
            origin = origin / 10;
            System.out.printf("origin : %d result : %d\n",origin,result);
        }
        return result;
    }

    public static void main(String[] args) {

        TeacherMain m = new TeacherMain();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(m.solution(n));
    }
}
