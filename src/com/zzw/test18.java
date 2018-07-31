package com.zzw;

import java.util.List;
import java.util.Scanner;

public class test18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean flag = true;
        if(input.startsWith("-")){
            flag = false;
        }
        StringBuffer inputBuffer = new StringBuffer(input.substring(1));
        int inputnum = Integer.parseInt(inputBuffer.reverse().toString());

        System.out.println(inputnum);

        char[] number = String.valueOf(inputnum).toCharArray();


    }
}
