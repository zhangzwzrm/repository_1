package com.zzw;

import java.util.Scanner;

public class test28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int count  = 0 ;
        for (int i = 0; i < c.length; i++) {
            if('('==c[i]){
                count++;
            }else if(')'==c[i]){
                count--;
            }
        }
        if(count!=0){
            System.out.println(false);
        }else {
            System.out.println(true);
        }
    }
}
