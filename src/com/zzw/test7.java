package com.zzw;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 0) {
            System.out.println("0:00:00:00");
        } else {
            int s = a % 60;
            int m = (a - s) % 3600 / 60;
            int h = (a - s - m * 60) % (3600 * 24) / 3600;
            int d = (a - s - m * 60 - h * 3600) / (3600 * 24);

            String s1;
            String m1;
            String h1;
            String d1;
            if (s < 10) {
                s1 = "0" + s;
            } else {
                s1 = s + "";
            }
            if (m<10){
                m1 = "0" + m;
            }else{
                m1 = m + "";
            }
            if(h<10){
                h1 = "0" + h;
            }else{
                h1 = h + "";
            }
            System.out.println(d + ":" + h1 +":" + m1 + ":" + s1);
        }
    }
}
