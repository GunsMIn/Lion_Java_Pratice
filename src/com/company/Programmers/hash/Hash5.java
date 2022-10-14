package com.company.Programmers.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hash5 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42578

    public int solution(String[][] clothes) {
        int answer = 1;
           //옷을 종류별로 구분한다
        Map<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0)+1); //해싱을 통해서 각 타입별 옷의 개수를 count
        }

        Iterator<Integer> val = map.values().iterator();

        while (val.hasNext()) {
          answer *= val.next()+1; // 없는것도 경우의 수에 넣어주어야하기때문에
        }
        return answer-1; // 마지막은 2개다 아무것도 안입었을대는 제외해주어야하니까까
         }

}
