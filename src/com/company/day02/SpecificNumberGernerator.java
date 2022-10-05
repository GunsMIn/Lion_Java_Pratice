package com.company.day02;

public class SpecificNumberGernerator implements NumberGenerator{
    @Override
    public int generate(int num) {
        return 2000 * num;
    }
}
