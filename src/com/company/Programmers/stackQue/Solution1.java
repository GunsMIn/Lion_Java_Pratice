package com.company.Programmers.stackQue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution1 {

    //https://school.programmers.co.kr/learn/courses/30/lessons/12906
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }


    public int[] solution2(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        int num = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                list.add(arr[i]);
                num = arr[i];
            }
        }
        answer = new int[list.size()]; //answer 리스트 크기 선언.
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }



    public static void main(String[] args) {


    }
}
