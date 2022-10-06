package com.company.day02;

public class RandomNumberMaker implements NumberMaker {

    @Override
    public int make(int num) {
        return (int)(Math.random()*num);
    }
}
