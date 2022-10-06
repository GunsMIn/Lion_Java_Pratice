package com.company.day02;

public class Calculator {

    //NumberMaker에서 만들어준 숫자를 가지고 사칙연산경과를 출력

    private NumberMaker numberMaker;

    //생성자
    public Calculator(NumberMaker numberMaker) {
        this.numberMaker = numberMaker;
    }


    public void plus(int num) {
        int result = num + this.numberMaker.make(10);
        System.out.println(result);
    }
}
