package com.company.Programmers.List;

import java.util.Arrays;

public class Solution2 {

    public boolean solution(int[] arr) {
        boolean answer = true;

        Arrays.sort(arr); // 정렬됨
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr[i]) {
                answer =false;
            }
        }

        return answer;
    }

}
