package com.zzw;

import java.util.Scanner;

public class test47
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuffer sb = new StringBuffer(input);
        if(input.equals(sb.reverse().toString())){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
