package com.zzw;

import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] string = sc.nextLine().split(",");
        StringBuffer sb1 = new StringBuffer(string[0]);
        StringBuffer sb2 = new StringBuffer(string[1]);

        int res = Integer.valueOf(Integer.valueOf(sb1.reverse().toString()) +
                Integer.valueOf(sb2.reverse().toString()));
        System.out.println(res);
    }
}
