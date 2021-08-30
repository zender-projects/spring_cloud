package com.sort;

public class InsertSort {

    public static void sort(int[] array) {

        int i, j ;
        int len = array.length;
        int target;

        for (i = 1; i < len ;i ++) {
            j = i;
            target = array[i];
            //为target找到正确的位置
            while (j > 0 && target < array[j - 1]) {
                array[j] = array[j - 1];
                j -- ;
            }
            array[j] = target;
        }

    }

}
