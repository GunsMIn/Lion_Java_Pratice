package com.company.Programmers.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hash6 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        //장르별 재생 횟수를 추가해주자
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i],0) + plays[i]);
            //키가 중복이된다면 value가 대체가 되기때문에
        }

        for (int i = 0; i < plays.length; i++) {
            list.add(plays[i]);
        }


        System.out.println(map.entrySet());
        while (list.iterator().hasNext()) {
            System.out.println(list.iterator().next().intValue());
        }


        return answer;
    }

    public static void main(String[] args) {
        Hash6 h = new Hash6();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] playes = {500, 600, 150, 800, 2500};

        System.out.println(h.solution(genres,playes));

    }

}
