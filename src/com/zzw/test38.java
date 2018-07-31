package com.zzw;

import java.util.Scanner;

public class test38 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        System.out.println(s[0]);
        System.out.println(s[1]);

        if(s[0].length()==15){
            System.out.println(Integer.parseInt(s[1]) -  Integer.parseInt("19"+s[0].substring(6,8)));
        }else{
            System.out.println(Integer.parseInt(s[1]) - Integer.parseInt(s[0].substring(6,10)));
        }
    }
}
