package com.company.day2;

public class Main {

    public static void main(String[] args) {

        NumberMaker numberMaker = new RandomNumberMaker();
        Calculator randomNumberCalculator = new Calculator(numberMaker);
        randomNumberCalculator.plus(20);

        Calculator byPassNumberCalculator = new Calculator(new ByPassNumberMaker());
        byPassNumberCalculator.plus(50);

    }

}
