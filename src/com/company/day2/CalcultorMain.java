package com.company.day2;

public class CalcultorMain {


    public static void main(String[] args) {
        Calculator calculator = new Calculator(10,20);
        calculator.plus();
        calculator.minus();
        calculator.multiple();

        System.out.println(calculator.divide());

    }
}
