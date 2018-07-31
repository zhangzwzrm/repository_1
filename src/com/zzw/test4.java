package com.zzw;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(",");
        char[] c = new char[s.length];
        for (int i = 0; i < c.length; i++) {
            c[i] = (char) Integer.parseInt(s[i]);
        }
        String res = String.valueOf(c);
        System.out.println(res.replaceAll("[^a-zA-Z]","?"));
    }
}
