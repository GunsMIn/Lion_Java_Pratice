package com.company.day09;

public class Factorial {
    //반복문을 활용한 팩토리얼 구현 3! = 3*2*1
    public int factorial(int number) {
        int sum = 1; // 곱을 계속해서 합으로!
        for (int i = 2; i < number; i++) {
            sum *= i;
        }
        return sum;
    }

    //재귀함수를 이용한 팩토리얼
    public int selfFactorial(int number) {
        if (number == 1) {
            return 1; // 재귀함수의 종료 지점 (1일때 메소드 종료)
        }else{
            return number * selfFactorial(number - 1);
        }
    }


   public static void main(String[] args) {
        System.out.println("10팩토리얼 구현" +new Factorial().factorial(10));
    }

}
