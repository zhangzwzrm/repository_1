package com.zzw;

import java.util.Scanner;
/**
 * @author Cloud_zp
 *
 * @category 字符串操作
 * 题目：将字符串中的字母全部替换成该字母的下一个字母，要是最后一位是z或者Z则替换为a或者A。
 * 输入：aBxyZ
 * 输出：bCyzA
 */

public class test21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] word = input.toCharArray();
        for (int i = 0; i < word.length; i++) {
            if(word[i]=='z'){
                word[i]='a';
            }else if( word[i]=='Z'){
                word[i]='A';
            }else{
                word[i] = (char)(word[i]+1);
            }
        }
        System.out.println(new String(word));
    }
}
