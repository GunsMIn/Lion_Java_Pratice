package com.company.day09;

public class RepeatTest {
    public static void main(String[] args) {
        // String 및 StringBuilder 호출
        String str = "Hello";
        StringBuilder sb = new StringBuilder();

        // 반복문을 사용하여 문자열 반복
        for(int i = 0; i < 3; i++) {sb.append(str);}

        // 결과 출력 -> for문
        System.out.println("for문 : " + sb);
        // 결과 출력 -> repeat 사용
        System.out.println("repeat문 : " + str.repeat(3));
    }
}
