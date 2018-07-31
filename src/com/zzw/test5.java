package com.zzw;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(",");

        int x = s[0].compareToIgnoreCase(s[1]);
        System.out.println(x);
    }
}
