package com.offer;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
 * 思路：
 *  1. 遍历
 *  2. 二分法
 * @author：zhangdong@tianyancha.com
 * @date：2021-08-19 12:26
 * @version：1.0.0
 */
public class _008_CycleArrayMinValue {

    public int minNumberInRotateArray(int [] array) {
        if(array==null||array.length==0){
            return 0;
        }
        if(array.length==1){
            return array[0];
        }
        int max = array[0];
        for(int i = 1;i < array.length;i ++){
            if(array[i] > max){
                max = array[i];
            }
            //如果发现了后一个比前一个小的话，就找到了组下值
            if(array[i] < max){
                return array[i];
            }
        }
        return 0;
    }


    //双指针
    public static int minNumberInRotateArray2(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        int low = 0, high = array.length - 1;
        //while (high - low > 1) {
        while (high > low) {
            int mid = (low + high) / 2;
            if (array[mid] > array[high]) {
                //向右靠
                low = mid;
            } else if (array[mid] < array[high]) {
                //向左靠
                high = mid;
            } else {
                //相等，高位-1
                high--;
            }
        }
        return Math.min(array[low], array[high]);
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,0,1};
        System.out.println(minNumberInRotateArray2(arr));
    }
}
