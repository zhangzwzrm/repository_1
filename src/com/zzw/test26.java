package com.zzw;

import java.util.Scanner;

public class test26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count0 = 0 ;
        int count1 = 0 ;
        System.out.println(Integer.toBinaryString(input));
        while(input >0){
            if(input%2==1){
                count1++;
                input = input /2 ;
            }else {
                count0++;
                input = input/2;
            }
        }
        System.out.println(count0 + ":" + count1);
    }
}
