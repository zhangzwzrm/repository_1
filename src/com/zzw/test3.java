package com.zzw;

import java.util.Scanner;

public class test3  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("[\\s+]");
        String res = s[0];
        for(int i=1;i<s.length;i++){
            if(s[i].length() > res.length()){
                res = s[i];
            }
        }
        System.out.println(res);
    }
}
