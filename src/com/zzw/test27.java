package com.zzw;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.math.BigInteger;
import java.util.Scanner;

public class test27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(getNumber(new BigInteger(input)));
    }

    private static int getNumber(BigInteger bigInteger) {
        String s = String.valueOf(bigInteger);
        int res = 0;
        s = s.replace("0","2");
        s = s.replace("1","0");
        s = s.replace("2","1");
        System.out.println(s);

        StringBuffer sb = new StringBuffer(s);
        res = Integer.parseInt(sb.reverse().toString(),2);

        return res;
    }
}
