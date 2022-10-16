package com.company.Programmers.List;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int a : arr) {
            if (max < a) {
                max = a; // 이 반복문이 끝나면 max의 값이 주어진다.
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                list.add(i);
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
             answer[i] = list.get(i);
        }
        return answer;
    }

}
