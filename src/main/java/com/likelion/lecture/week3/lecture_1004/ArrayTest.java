package com.likelion.lecture.week3.lecture_1004;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int []array = new int[10];

        for(int i=0;i<array.length;i++){
            array[i] = i+1;
        }
        System.out.println(Arrays.toString(array));
    }
}
