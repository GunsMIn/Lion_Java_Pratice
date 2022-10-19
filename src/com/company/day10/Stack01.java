package com.company.day10;

import jdk.jfr.StackTrace;

import java.util.Arrays;
import java.util.Stack;

public class Stack01 {

    private int[] arr = new int[100]; // 정해놓은 100개를 넘어섰을때 stack overflow발생!

    private int pointer = 0;


    public Stack01() {;}

    public Stack01(int size) {
        this.arr = new int[size];
    }

    //push 함수 구현 arr[]에 차례대로 int를 넣는 기능
    public void push(int value) {
        arr[pointer] = value;
        pointer++;
    }

    public int[] getArr() {
        return arr;
    }


    public static void main(String[] args) {
        Stack01 s = new Stack01();
        int[] arr = s.getArr();
        s.push(10);
        s.push(20);
        System.out.println(Arrays.toString(arr));
    }
}
