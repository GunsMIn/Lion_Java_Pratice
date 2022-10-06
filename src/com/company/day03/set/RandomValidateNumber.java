package com.company.day03.set;

import java.util.HashSet;
import java.util.Set;

public class RandomValidateNumber {


    public static void main(String[] args) {
        RandomNumberCreator randomNumberGenerator = new RandomNumberCreator();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 50; i++) {
            set.add((char)randomNumberGenerator.generate(26)+65);
        }
        System.out.println("중복제거된 count: " + set.size());
        System.out.println(set);
    }
}
