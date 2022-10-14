package com.company.day07;

import java.util.Arrays;

public class SelectionSort {

    //선택정렬은 가장 작은것을 선택해서 가장 앞으로 보낸다.
    public static void main(String[] args) {

        int[] arr = {7, 2, 9, 20, 11};
        int tmp = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i; // 선택정렬에서의 최소값의 인덱스번호
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            tmp = arr[min]; // 가장 최소값을 저장소에 저장
            arr[min] = arr[i]; // i의 인덱스 배열이랑 최소값 배열값 교환
            arr[i] = tmp;   //최소값을 i의 인덱스에 저장
        }
        System.out.println(Arrays.toString(arr));
    }
    }

