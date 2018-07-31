package com.zzw;

import java.util.Scanner;

public class test46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();
        String x = i + " ";
        String[] s = x.split("\\.");
        if (i >= 0) {
            int y = Integer.parseInt(String.valueOf(s[1].charAt(0)));
            if (y < 5) {
                System.out.println(s[0]);
            } else {
                System.out.println(Integer.parseInt(s[0]) + 1);
            }
        } else {
            int y = Integer.parseInt(String.valueOf(s[1].charAt(0)));
            if (y < 5) {
                System.out.println(Integer.parseInt(s[0]) - 1);
            } else {
                System.out.println(s[0]);
            }
        }
    }
}
