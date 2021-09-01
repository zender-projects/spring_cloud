package com.offer;

/**
 * 斐波那契数列
 * */
public class _10_Fib {

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int pre = 0;
        int cur = 1;
        int res = 0;
        for (int i = 2;i <= n ;i ++) {
             res = pre + cur;
             pre = cur;
             cur = res;
        }
        return res;
    }

}
