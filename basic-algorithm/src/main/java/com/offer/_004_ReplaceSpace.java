package com.offer;

/**
 * 1. 请实现一个函数，将一个字符串中的空格替换成“%20”。 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * 思路：
 *    计算出空格数量
 *    构造一个  originLength + spaceCount * 2 的空数组
 *    遍历原字符串，塞到新数组中，遇到空格塞 %20
 *
 * @author：zhangdong@tianyancha.com
 * @date：2021-08-19 12:00
 * @version：1.0.0
 */
public class _004_ReplaceSpace {

    public static String replaceSpace(String originStr) {
        //字符串转字符数组
        char[] chars = originStr.toCharArray();

        int spaceNum = 0;
        //计算出空格的个数
        for (int i = 0;i < chars.length;i ++) {
            if (chars[i] == ' ') {
                spaceNum ++ ;
            }
        }

        int newCharsLength = chars.length + spaceNum * 2;
        char[] newChars = new char[newCharsLength];

        int newStrIndex = 0;
        for (int index = 0; index < chars.length; index ++) {
            if (chars[index] != ' ') {
                newChars[newStrIndex++] = chars[index];
            } else {
                newChars[newStrIndex++] = '%';
                newChars[newStrIndex++] = '2';
                newChars[newStrIndex++] = '0';
            }
        }
        return new String(newChars);
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("a b c"));
    }

}
