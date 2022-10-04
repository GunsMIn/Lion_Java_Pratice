package com;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        int sum = 0;

        for (int i = 0; i < n  ; i++) {
            char c = str.charAt(i);
            int e = c - 48;
            sum+=e;
        }

        System.out.println("sum : " + sum);


    }
}
