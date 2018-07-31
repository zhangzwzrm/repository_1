package com.zzw;

import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String res = input.replaceAll("[^A-Z]","");
        System.out.println(res);
    }
}
