package com.company.day09;

public class SquareStar {
    //정사각형 별찍기
    public void printSquare(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        SquareStar star = new SquareStar();
        star.printSquare(3);

    }
}
