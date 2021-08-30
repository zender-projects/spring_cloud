package com.sort;

public class SortTester {

    public static void main(String[] args) {
        int[] array1 = {3,2,1,6,7,8,9,33};
        //BubbleSort.bubboSort(array1);
        //InsertSort.insertSort(array1);
        //SelectSort.sort(array1);
        MergeSort.sort(array1);
        PrintArray.print(array1);
    }
}
