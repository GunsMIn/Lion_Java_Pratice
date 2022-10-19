
package com.company.Programmers.stackQue;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {

    //https://school.programmers.co.kr/learn/courses/30/lessons/42586
    public int[] solution(int[] progresses, int[] speeds) {
        //[93,30,55] , [1,20,5]
        //우선 2배열을 이용해서 일 수를 담을 배열을 생각을해야한다.
        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            float p = progresses[i];
            float s = speeds[i];
            int day = (int)Math.ceil((100 - p) / s); // 소수점을 무조건 올림해준다음 int형으로 일수로 변환
            que.offer(day);
        }
        //[7,3,9]
        Queue<Integer> answer = new LinkedList<>();
        int a1 = que.poll();
        int cnt = 1;
        while (!que.isEmpty()) {
            int a2 = que.poll();
            if (a1 >= a2) {
                cnt ++ ; // cnt만 증가만 시키고 끝낸다 다음반복문으로!
                continue;
            }//여기서 부터는 a2가 클 때 넣어준다 answer에
            answer.offer(cnt);
            cnt = 1;
            a1 = a2;
        }
        answer.offer(cnt);



        return answer.stream().mapToInt(Integer::intValue).toArray();
    }


    public int[] solutions(int[] progresses, int[] speeds) {
        Queue<Integer> que = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            float progress = progresses[i];
            float speed = speeds[i];
            int day = (int) Math.ceil((100 - progress) / speed);
            que.offer(day);
        }
        //[7,3,9]
        Queue<Integer> answer = new LinkedList<>();
        int count = 1;
        int pre = que.poll();
        while (!que.isEmpty()) {
            int late = que.poll();
            if (pre >= late) {
                count++;
                continue;
            }
            //뒤에것이 크다면
            answer.offer(count);
            count =1;
            pre = late;
        }
        answer.offer(count);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

}
