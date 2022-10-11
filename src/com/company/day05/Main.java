package com.company.day05;

import java.util.Scanner;

public class Main {
    //자릿수 더하기문제
    //자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
    //예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
    public int solution(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }


    public static void main(String[] args) {

        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(m.solution(n));

    }
}
