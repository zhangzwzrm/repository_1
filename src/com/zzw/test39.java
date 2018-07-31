package com.zzw;

import java.util.Scanner;

public class test39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = str.replaceAll("[^a-z]","");
        char[] c = s.toCharArray();

        for(int i = 0 ; i < c.length ; i++){
            if(c[i]-32 + 5 >'Z') {
                str = str.replace(String.valueOf(c[i]), String.valueOf((char) (c[i] + 5 - 32 - 26)));
            }else{
                str = str.replace(String.valueOf(c[i]),String.valueOf((char)(c[i]+5-32)));
            }
        }
        System.out.println(str);
    }
}
