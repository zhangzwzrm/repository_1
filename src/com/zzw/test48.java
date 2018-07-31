package com.zzw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class test48 {
    public static void main(String[] args) {
        Random random = new Random();
        List<String> list = new ArrayList<String>();
        String s = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwx";

        for (int i = 0; i < 50; i++) {
            String str = "";
            int len = random.nextInt(7) + 4;
            for (int j = 0; j < len; j++) {
                str += s.charAt(random.nextInt(s.length()));
            }

            for (int j = 0; j < 10; j++) {
                if (str.length() < 10) {
                    str += " ";
                } else {
                    list.add(str);
                    break;
                }
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (i % 4 == 3) {
                System.out.println(list.get(i));
            } else {
                System.out.print(list.get(i));
            }
        }
    }
}
