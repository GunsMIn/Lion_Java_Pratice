package com.company.Programmers.ALL;

import java.util.*;

public class Solution {
    //https://school.programmers.co.kr/learn/courses/30/lessons/92334
    //https://www.youtube.com/watch?v=ncCUNOJUn9Q&t=1s
                                        //유저          //신고유저    //k번이상신고되면 x
        public int[] solution(String[] id_list, String[] report, int k) {
            int[] answer = new int[id_list.length];

            //1.중복제거
            Set<String> reportSet = new HashSet<>();
            for (String rep : report) {
                reportSet.add(rep); // reportSet에는 중복이 제거되어있다
            }
            //2.notifyListHash 제작(신고당한사람,신고한사람)
            Map<String, ArrayList<String>> notifyListHash = new HashMap<>();
            for (String rep : reportSet) {
                int blankInt = rep.indexOf(" ");
                String reporter = rep.substring(0, blankInt); // 신고한 사람
                String reportee = rep.substring(blankInt+1); // 신고당한 사람

                ArrayList<String> reportList = notifyListHash.getOrDefault(reportee, null);
                if (reportList == null) {
                    reportList = new ArrayList<>();
                    reportList.add(reporter);
                    notifyListHash.put(reportee, reportList);
                }
            }
            //3.notifyListHash를 기반으로  reportHash만들기
            Map<String, Integer> reportHash = new HashMap<>();
            for (ArrayList<String> values : notifyListHash.values()) {
                if (values.size() >= k) {

                }
            }


            return answer;
        }
}
