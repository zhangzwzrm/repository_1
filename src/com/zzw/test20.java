package com.zzw;

import java.util.Scanner;

public class test20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        char[] input = inputString.toCharArray();

        for(int i=0 ; i< input.length ;i++){
            input[i] += 5;
            if(input[i]>'z'){
                input[i] -= 26;
            }
            System.out.println(input[i]);
        }
    }
}
