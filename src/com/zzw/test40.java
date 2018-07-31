package com.zzw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class test40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(",");
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i<str.length ; i++){
            list.add(Integer.parseInt(str[i]));
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-1) + "," + list.get(list.size()-2));
    }
}
