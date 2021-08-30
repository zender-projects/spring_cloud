package com.sort;

public class SelectSort {

    public static void sort(int[] array) {
        for (int i = 0;i < array.length - 1;i ++) {
            int min = i;
            for (int j = i + 1;j < array.length; j ++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            if (min != i) {
                swap(array, min, i);
            }
        }
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

}
