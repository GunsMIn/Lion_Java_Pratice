package com.company.day09;

public class RecursiveStar {
    /*1.자기 자신을 호출하는 함수
    Recursive → 재귀(다시 돌아온다)
    재시작 + 귀환 → 나를 반복 한다
    2.끝나는 조건을 '꼭' 넣어주어야 합니다. 안그러면 무한히 실행 됩니다.
    3.변화를 주는 구간이 '꼭'들어가야 합니다.
    탈출 조건을 짜놓고 저 조건까지 갈 수 없다면 역시나 무한히 실행 됩니다.*/


    //재귀는 우선적으로 탈출조건을 만들고 잘 작동하는지 확인해야한다.
    public void printARow(int n, String now) {
        if (n == now.length()) {
            System.out.println(now);
            return;
        }
        System.out.println(now);
        printARow(5,now+"*");
    }


    public static void main(String[] args) {
        new RecursiveStar().printARow(5, "");
    }
}
