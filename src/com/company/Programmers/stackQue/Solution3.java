package com.company.Programmers.stackQue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution3 {

    class Paper{
        boolean isMine; // 내 문서냐 아니야
        int priority; // 우선순위

        public Paper(boolean isMine, int priority) {
            this.isMine = isMine;
            this.priority = priority;
        }
    }


    public int solution(int[] priorities, int location) {
        List<Paper> list = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            list.add(new Paper(i == location, priorities[i]));
        }
    while(!list.isEmpty()) {
        Paper now = list.remove(0);
        boolean flag = true;
        for (Paper each : list) {
            if (now.priority < each.priority) {
                flag = false;
                break;
            }
        }
        if (!flag) {
            list.add(now);
            continue;
        }
        
    }
        int answer = 0;
        return answer;
    }

}
