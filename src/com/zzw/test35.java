package com.zzw;

import java.util.Scanner;

public class test35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String res = x + " = " ;
        if(x<=2){
            System.out.println(res + x);
        }else {
            for (int i = 2;  i < x; i++) {
                if(x%i==0){
                    res += i + "*";
                    x/=2;
                    i--;
                }
            }
        }
        System.out.println(res + x);
    }
}
