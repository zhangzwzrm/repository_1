package com.zzw;

import java.lang.reflect.Parameter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stu02 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d{4}");
        Matcher m = p.matcher("1234-1234-1234");
        //
        System.out.println(m.matches());
        //
        m.reset();
        //
        System.out.println(m.find());
        System.out.println(m.find());
        System.out.println(m.find());
    }
}
