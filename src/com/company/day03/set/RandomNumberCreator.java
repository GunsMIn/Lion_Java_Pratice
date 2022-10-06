package com.company.day03.set;

public class RandomNumberCreator implements NumberCreator {


    @Override
    public int generate(int num) {
        return (int)(Math.random()*num);
    }
}
