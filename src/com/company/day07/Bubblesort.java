package com.company.day07;

import java.util.Arrays;

public class Bubblesort {
    
    public static void main(String[] args) {

        		int[] a = {7, 2, 9, 20, 11};
        		int tmp; // 2개의 원소를 바꾸기윈한 배열을 담을 수 있는 저장소소

       			for(int i = 0 ; i < a.length ; i ++) {
        			for(int j = 0 ; j < a.length -i -1 ; j ++) { // 버블 정렬은 집합을 감소시키는 특성을 가지고있다.
        				if(a[j]>a[j+1]) { // 당장 바로 옆에있는것과 비교하는것이다.
							tmp = a[j];
							a[j] = a[j+1];
							a[j + 1] = tmp;
        					}
        				}
        			}

        			for(int i = 0 ; i < a.length ; i ++) {
        				System.out.println(a[i]);
        			}

    }



}
