package com.zzw;

import java.util.Scanner;

public class test44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] s = input.split(" ");
        String res = "";
        for(int i = 0 ; i < s.length ; i++){
            res += s[s.length-i-1] + " ";
        }
        System.out.println(res.trim());
    }
}
