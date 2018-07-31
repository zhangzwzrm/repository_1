package com.zzw;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String res = input.replaceAll("[^a-zA-Z]","");
        res += input.replaceAll("[^0-9]","");
        System.out.println(res);
        System.out.println(input);
        System.out.println();

    }
}
