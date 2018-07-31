package com.zzw;

import java.util.Scanner;

public class test41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = s.charAt(0);
        char res = (char)(c - 32 +5);
        if(res > 122){
            res = (char)(res -26);
        }
        System.out.println(res);
    }
}
