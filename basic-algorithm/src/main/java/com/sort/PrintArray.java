package com.sort;

public class PrintArray {
    public static void print(int[] array) {
        StringBuilder stringBuilder = new StringBuilder("[ ");
        for (int i = 0;i < array.length;i ++) {
            stringBuilder.append(array[i] + " ");
        }
        stringBuilder.append("]");
        System.out.println(stringBuilder.toString());
    }
}
