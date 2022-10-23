package com.company.Programmers.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution3 {
    public int[] solution(long n) {
        List<Integer> list = new ArrayList<>();
        String str = String.valueOf(n);
        //12345
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(str.length() - i - 1)-48);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    //풀이 2번번
   public int[] solutions(long n) {
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            int a = (int)(n % 10);
            list.add(a);
            n /= 10;
        }
        //list를 array로 변환하는 방법!
        return list.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution3 s = new Solution3();
        System.out.println(s.solutions(12345));
    }
}
