package com.company.Programmers.ALL;

public class Solution2 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/87389
    //https://haruple.tistory.com/m/196
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
