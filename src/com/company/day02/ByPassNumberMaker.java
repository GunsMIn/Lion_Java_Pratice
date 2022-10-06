package com.company.day02;

public class ByPassNumberMaker implements NumberMaker {
    @Override
    public int make(int num) {
        return num;
    }
}
