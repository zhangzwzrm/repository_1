package com.zzw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(",");
        int[] in = new int[s.length];
        for (int i = 0; i < in.length; i++) {
            in[i] = Integer.parseInt(s[i]);
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < in.length; i++) {
            int a = in[i];

             if(a%2==0){
                    list.add(in[i]);
             }
        }
        System.out.println(list);
    }
}
