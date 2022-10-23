package com.company.Programmers.stackQue;

import java.util.ArrayList;
import java.util.List;

public class Solution4 {
    class Print{
        int printCount;
        boolean isMine;

        public Print(int printCount, boolean isMine) {
            this.printCount = printCount;
            this.isMine = isMine;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        List<Print> list = new ArrayList<>();
        for (int i = 0; i < priorities.length; i++) {
            list.add(new Print(priorities[i], location == i)); // list에 넣어줌
        }

        while (!list.isEmpty()) {
            Print now = list.remove(0);//계속 앞에있는것을빼줌
            boolean flag = false;
            for (Print next : list) {
                if (next.printCount > now.printCount) {
                    flag = true;
                }
            }
            if (flag) { // 다시 넣어주어야함 now
                list.add(now);
                continue;
            }
            //프린트를 뽑는 경우
            answer++;
            if (now.isMine) { //now가 우선순위가 true일경우
                return answer;
            }


        }
        return answer;
    }
}
