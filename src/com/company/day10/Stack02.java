package com.company.day10;

public class Stack02 {

    private Integer[] arr;
    int size = 0;
    int pointer = 0;

    public Stack02() {;}

    public Stack02(int size) {
        arr = new Integer[size];

    }

    public int push(int value) {
        return arr[pointer++] = value;
    }

    public int pop() {
        int popValue = arr[pointer];
        arr[pointer] = 0;
        pointer--;
        return popValue;
    }

}
