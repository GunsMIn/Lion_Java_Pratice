package com.company.day02;

public class Calculator {

    // NumberCreator
    NumberGenerator numberGenerator;

    public Calculator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void plus() {
        System.out.println(10 + numberGenerator.generate(10));
    }



}
