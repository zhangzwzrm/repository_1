package com.zzw;

import java.util.*;

public class test29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<String> set = new HashSet<String>();
        List<String> list = new ArrayList<String>();
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < s.length() - i + 1; j++) {
                if (set.add(s.substring(j, j + 1))) {
                    list.add(s.substring(j, j + i));
                }
            }
        }
        System.out.println(list);
    }
}
