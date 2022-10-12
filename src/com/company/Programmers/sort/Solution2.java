
package com.company.Programmers.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Solution2 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42746
    public String solution(int[] numbers) {

        String answer = "";
        String[] strArr = new String[numbers.length]; //int 배열를 String 배열로 바꿔주기위해서는 똑같이 배열이 존재해야함
        for (int i = 0; i < numbers.length; i++) {
           strArr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2); // 내림차순
                //return (o1 + o2).compareTo(o1 + o2);오름차순
            }
        });
        //내림차순 진행됨

        for (String s : strArr) {
            answer += s;
        }

        return answer;
      }


    public static void main(String[] args) {

        Solution2 s = new Solution2();
        int[] numbers = {3, 30, 34, 5, 9};
        System.out.println(s.solution(numbers));
    }


}




/* int max = Integer.MIN_VALUE;
   //우선 첫번째 숫자를 가장큰수를 가장앞에 놓아야한다.
 for (int i = 0; i < numbers.length; i++) {
     max = Math.max(max, numbers[i]);

 }

 answer += String.valueOf(max);*/

