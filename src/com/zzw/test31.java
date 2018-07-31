package com.zzw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int x = sc.nextInt();
        String[] s = input.split(",");
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < s.length; i++) {
            list.add(s[i]);
        }
        for(int i = 0 ; i < s.length -x ;i++){
            list.add(list.remove(0));
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = list.get(i);
        }
        System.out.println(list);
    }
}
