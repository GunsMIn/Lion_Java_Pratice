package com.company.Programmers.ALL;

import java.util.Stack;

public class Solution4 {

    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            }else{
                if (stack.isEmpty()) {
                    answer = false;
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            answer = true;
        }

        return answer;
    }
}
