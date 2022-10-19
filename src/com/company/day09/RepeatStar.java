package com.company.day09;

public class RepeatStar {
    public void starWithRepeat(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*".repeat(n));
        }
    }
    public static void main(String[] args) {
        RepeatStar r = new RepeatStar();
        r.starWithRepeat(5);
    }
}
