package com.zzw;

import java.util.Scanner;

public class test42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        String str = "";
        int max = 0;
        for(int i=0 ; i < c.length ;i++){
            int count = 0 ;
            for(int j =1 ; j< c.length; j++){
                if(c[i]==c[j]){
                    count++;
                }
            }
            if(count > max){
                str = String.valueOf(c[i]);
                max = count;
            }else  if(count==max){
                str += c[i];
            }
        }
        char[] c2 = str.toCharArray();
        for(int i = 0 ; i <c2.length;i++){
            s = s.replace(String.valueOf(c2[i]),"");
        }
        System.out.println(s);
    }
}
