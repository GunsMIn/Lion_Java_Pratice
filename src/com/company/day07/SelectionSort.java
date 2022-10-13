package com.company.day07;

import java.util.Arrays;

public class SelectionSort {

    //선택정렬은 가장 작은것을 선택해서 가장 앞으로 보낸다.
    public static void main(String[] args) {

        int[] arr = {7, 2, 9, 20, 11};
        int tmp = 0;


        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }

        System.out.println(Arrays.toString(arr));
    }
    }

