package com.company.day2;

public class RandomNumberMaker implements NumberMaker {

    @Override
    public int make(int num) {
        return (int)(Math.random()*num);
    }
}
