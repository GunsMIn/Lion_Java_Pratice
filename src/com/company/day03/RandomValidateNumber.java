package com.company.day03;

import java.util.HashSet;
import java.util.Set;

public class RandomValidateNumber {


    public static void main(String[] args) {
        RandomNumberCreator randomNumberGenerator = new RandomNumberCreator();
        Set<Integer> setInteger = new HashSet<>();
        for (int i = 0; i < 50; i++) {
            setInteger.add(randomNumberGenerator.generate(50));
        }
        System.out.println("Set 개수 : " + setInteger.size());
        System.out.println(setInteger);
    }
}
