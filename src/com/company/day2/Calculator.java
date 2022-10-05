package com.company.day2;

public class Calculator implements Random {

    int a;////

    public int random() {
        int r = (int) (Math.random() * 9) + 1;
        return r;
    }

    public void plus(int a) {
        System.out.println(a + random());
    }

    public void minus(int a) {
        System.out.println(a - random());
    }

    public void multiple(int a)
    {
        System.out.println(a * random());
    }

    public void divide(int a) {
        try {
            System.out.println(a / random());
        }catch (Exception e){
            System.out.println("랜덤하게 생성된 숫자가 0입니다");
        }

    }



}
