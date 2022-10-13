package com.company.day07;

import java.util.Arrays;

public class Bubblesort {
    
    public static void main(String[] args) {

        int[] a = {7, 2, 9, 20, 11};
        		int tmp;
        		for(int i = 0 ; i < a.length ; i ++) {
        			for(int j = 0 ; j < a.length -i -1 ; j ++) {
        				if(a[j]>a[j+1]) {
                            tmp = a[j];
        					a[j] = a[j+1];
        					a[j+1] = tmp;
        				}
        			}
        		}

        		for(int i = 0 ; i < a.length ; i ++) {
        			System.out.println(a[i]);
        		}

    }



}
