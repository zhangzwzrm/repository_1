package com.zzw;

public class stu01 {
    public static void main(String[] args) {
        System.out.println("123".matches("\\d\\d\\d"));
        System.out.println("1d23e".matches("\\d\\D\\d\\d\\D"));
        //s " "空格
        System.out.println("1 2 d".matches("\\d\\s\\d\\s\\D"));
        //w 常规字符
        System.out.println("aa b1 22".matches("\\w\\w\\s\\w\\w\\s\\w\\w"));
        //*
        System.out.println("asdfsdf".matches("a[a-z]*"));
        //+
        System.out.println("a".matches("a+"));
        //?
        System.out.println("a".matches("a?"));
        System.out.println("aa".matches("a?"));
        System.out.println("".matches("a?"));
        //{}
        System.out.println("123".matches("\\d{4}"));
        //^ , $
        System.out.println("1yo1".matches("\\w*\\d$"));
    }
}
