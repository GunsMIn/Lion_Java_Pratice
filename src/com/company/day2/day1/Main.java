package com.company.day2.day1;

import java.util.Scanner;

public class Main {

    public String test(int num) {
        String answer = "";
        if(num%2 == 0){
            answer = "even";
        }else{
            answer= "odd";
        }
        return answer;
    }

    public static void main(String[] args) {

        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        main.test(num);

    }
}
