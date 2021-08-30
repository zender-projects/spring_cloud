package com.sort;

public class QuickSort {
    public static void sort(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return;
        }

        int left = leftIndex;
        int right = rightIndex;

        //基准值
        int key = arr[left];
        while (left < right) {
            //从右向左，找到第一个比基准值小的值
            while (right > left && arr[right] >= key) {
                right --;
            }
            arr[left] = arr[right];

            while (left < right && arr[left] <= key) {
                //从左往右，招到第一个比基准值大的值
                left ++;
            }
            arr[right] = arr[left];
        }

        //基准值归位
        arr[left] = key;
        sort(arr, leftIndex, left - 1);
        //System.out.println(arr, lIdx, );
        sort(arr, right + 1, rightIndex);
    }
}
