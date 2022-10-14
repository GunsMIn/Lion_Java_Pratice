package com.company.Programmers.sort;

import java.util.Arrays;

public class Solution5 {
    //https://school.programmers.co.kr/learn/courses/13577/lessons/96096
    public String solution(String s) {
        String answer = "";
        //각 단어의 첫 글자만 제외하고는 소문자이므로
        //전체를 우선 소문자로 만들어준다
        //문자열 공백을 기준으로 잘라서 넣기
        String[] str = s.split(""); //한글자씩 문자열로 만들기
        System.out.println(Arrays.toString(str));
        boolean space = true;

        for (String s1 : str) {
            answer += space ? s1.toUpperCase() : s1;
            space = s1.equals(" ") ? true : false;
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "3people unFollowed me";
        Solution5 solution5 = new Solution5();
        System.out.println(solution5.solution(s));

    }

}
