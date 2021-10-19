package com.blz.linecomparison;
import java.util.*;

public class LineComparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome To Line Comparison Computation Program");

        System.out.println("Enter the First point of Co-ordinates");
        System.out.println("Enter x1 and y1 values : ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();

        System.out.println("Enter the Second point Co-ordinates");
        System.out.println("Enter x2  and y2 values : ");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        double firstLine = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.println("Length of line : " + firstLine);

    }
}
