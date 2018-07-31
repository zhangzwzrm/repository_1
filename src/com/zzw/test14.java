package com.zzw;

import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        StringBuffer sb = new StringBuffer(string);
        if (string.endsWith("0")) {
            System.out.println(true);
        } else {
            if (string.equals(sb.reverse().toString())) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
