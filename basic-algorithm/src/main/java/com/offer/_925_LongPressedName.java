package com.offer;

import java.util.LinkedList;

public class _925_LongPressedName {

    public boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length()) {
            return false;
        }
        int i = 0, j = 0;
        while (j < typed.length()) {
            //如果上下都相同
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }
            //如果不等，上下不等，并且下面有重复的，下面
            else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }

        return i == name.length();
    }

}
