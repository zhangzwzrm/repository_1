package com.zzw;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{5,6,7,8,9}};

        Arrays.sort(array[0]);
        Arrays.sort(array[1]);
        System.out.println(array[0][0]);
        System.out.println(array[1][0]);
    }
}
