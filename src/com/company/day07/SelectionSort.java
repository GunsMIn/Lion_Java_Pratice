package com.company.day07;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {7, 2, 9, 20, 11};
        int tmp = a[0];
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
