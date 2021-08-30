package com.offer;

/**
 * 面试题3：数组中的重复元素
 *
 * 2,3,1,0,2,5,3
 *
 * 1,3,2,0,2,5,3
 *
 * 3,1,2,0,2,5,3
 *
 * 0,1,2,3,2,5,3
 *
 * => 2
 * */
public class _003_FindRepeatInArray {

    //修改元数组
    int duplicate(int[] array) {
        //如果数组为空
        if (array == null || array.length == 0) {
            return -1;
        }

        //如果包含不合规的数据
        for (int i = 0;i < array.length;i ++) {
            if (array[i] < 0 || array[i] > array.length - 1) {
                return -1;
            }
        }

        //从头到尾遍历数组
        for (int i = 0;i < array.length;i ++) {
            while (array[i] != i) {
                //将array[i]放到 index = array[i]的位置
                if(array[i] == array[array[i]]) {
                    return array[i];
                }

                int temp = array[i];
                array[i] = array[array[i]];
                array[array[i]] = temp;
            }
        }
        return -1;
    }

    //不修改原数组
    int duplication2(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        //数据范围 1 ~ n
        int start = 1;
        int end = array.length - 1;
        while (end >= start) {
            int mid = (start + end) / 2;
            int count = countRange(array, start, mid);
            //结束条件
            if (end == start) {
                if (count > 1) {
                    return start;
                } else {
                    break;
                }
            }

            //如果count的数量比前办部分的数据个数多，往前移
            if (count > (mid - start + 1)) {
                end = mid;
            }

            //如果count的数量比后半部分的数据个数多，往后移
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    //统计个数
    int countRange(int[] array, int start, int end) {
        if (array == null) {
            return 0;
        }

        int count = 0;
        for (int i = 0;i < array.length;i ++) {
            if (array[i] >= start && array[i] <= end) {
                count = count + 1;
            }
        }
        return count;
    }
}
