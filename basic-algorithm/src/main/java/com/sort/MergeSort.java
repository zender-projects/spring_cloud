package com.sort;

public class MergeSort {
    public static void sort(int[] array) {
        int[] temp = new int[array.length];
        internalSort(array, 0, array.length - 1, temp);
    }

    public static void internalSort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            //左分
            internalSort(arr, left, mid, temp);
            //右分
            internalSort(arr, mid + 1, right, temp);
            //merge
            merge(arr, left, mid, right, temp);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;   //左侧起始指针
        int j = mid + 1;  //右侧起始指针
        //临时数组指针
        int t = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[t ++] = arr[i ++];
            } else {
                temp[t ++] = arr[j ++];
            }
        }

        //处理左边剩余的
        while (i <= mid) {
            temp[t ++] = arr[i ++];
        }
        //处理右边剩余的
        while (j <= right) {
            arr[t ++] = arr[j ++];
        }

        t = 0;
        //讲temp中的数据拷贝到原数组中
        while (left <= right) {
            arr[left ++] = temp[t ++];
        }
    }

}
