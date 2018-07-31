package com.zzw;

import java.util.Arrays;
import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(getCount(array));
    }

    public static int getCount(int[] array) {
        int count = 0;
        int sum = 0;
        int ave = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        ave = sum / array.length;

        for (int i : array) {
            if (i > ave) {
                count++;
            }
        }
        return count;
    }
}
