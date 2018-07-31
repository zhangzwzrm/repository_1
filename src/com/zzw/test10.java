package com.zzw;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] input = str.toCharArray();
        System.out.println('A'-'f');
        System.out.println('z'-'E');

        for(int i = 0 ; i < input.length ; i++){
            input[i] += 37;
            if (input[i] >'z'){
                input[i]-= 90;
            }
            System.out.println(input[i]);
        }
    }
}
