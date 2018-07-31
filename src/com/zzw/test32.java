package com.zzw;

import java.util.Scanner;

public class test32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = str.replaceAll("[^a-z]","");
        char[] c = s.toCharArray();

        for(int i =0 ; i<c.length ; i++){
            if(c[i] -32 + 5 >'Z'){

            }
        }
    }
}
