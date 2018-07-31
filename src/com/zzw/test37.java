package com.zzw;

import java.util.Scanner;

public class test37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        StringBuffer res = new StringBuffer();
        for(int i = 0 ; i <s.length() ; i++){
            if(String.valueOf(s.charAt(i)).matches("[a-z||A-Z]")){
                res.append(s.charAt(i));
            }
        }
        String str = s.replaceAll("[a-z||A-Z]","");
        res.append(str);
        System.out.println(res.toString());
    }
}
