package com.zzw;

import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuffer inputBuffer = new StringBuffer(input).reverse();

        for (int i = 0; i <= 7; i++) {
            if (input.equals(inputBuffer)) {
                break;
            } else {
                input = String.valueOf(
                        Integer.valueOf(input) + Integer.valueOf(inputBuffer.toString())
                );
                inputBuffer = new StringBuffer(input).reverse();
            }
        }

        if(input.equals(inputBuffer.toString())){
            System.out.println(input);
        }else {
            System.out.println("0");
        }
    }
}
