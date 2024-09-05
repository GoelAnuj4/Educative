package org.example.lession1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        SquareSum squareSum = new SquareSum();
        System.out.println(squareSum.getSquareSum(1,2,3));
        System.out.println(squareSum.getSquareSum(-1,200,3));
        System.out.println(squareSum.getSquareSum(1,0,3));
    }
}
