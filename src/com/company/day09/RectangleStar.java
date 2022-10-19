package com.company.day09;

public class RectangleStar {

    public void makeStar(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        RectangleStar r = new RectangleStar();
        r.makeStar(3,4);




    }
}
