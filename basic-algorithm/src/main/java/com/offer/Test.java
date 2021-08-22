package com.offer;

public class Test {

    public static boolean isLongPressedName(String name, String typed) {

        if (!name.equals(typed)) {
            return false;
        }

        char[] nameChar = name.toCharArray();
        char[] typedChar = typed.toCharArray();

        int i = 0, j = 0;
        while (i < nameChar.length && j < typedChar.length) {
                if (nameChar[i] == typedChar[j]) {
                    i++;
                    j++;
                } else {
                    j++;
                }
        }

       return i == name.length();
    }

    public static void main(String[] args) {
        System.out.println("a");
        String s1 = "alex";
        String s2 = "aaleexa";
        System.out.println(isLongPressedName(s1, s2));


       /*

       "alex"
        "aaleexa"

       "saeed"
        "ssaaedd"
       "alex"
        "aaleex"
        "saeed"
        "ssaaedd"
        "leelee"
        "lleeelee"
        "laiden"
        "laiden"
        "leelee"
        "lleeelee"
        */
    }
}
