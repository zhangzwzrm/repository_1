package com.zzw;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("\\{|\\}", "");
        String[] num = str.split(",");
        int[] number = new int[num.length];
        int[] temp = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            number[i] = Integer.valueOf(num[i]);
            temp[i] = Integer.valueOf(num[num.length - i - 1]);
        }
        String res = "{";
        for (int i = 0; i < number.length;i++){
            number[i]+=temp[i];
            res +=number[i];
            res +=",";
        }
        res = res.substring(0,res.length()-1);
        res +="}";
        System.out.println(res);
    }

}
