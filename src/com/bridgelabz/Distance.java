package com.bridgelabz;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" x value ");
        int x = scan.nextInt();
        System.out.println(" y value ");
        int y = scan.nextInt();

        double z = Math.sqrt(x*x + y*y);
        System.out.println(z);
    }
}
