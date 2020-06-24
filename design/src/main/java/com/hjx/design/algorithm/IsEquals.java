package com.hjx.design.algorithm;

import java.util.Arrays;

/**
 * @Desc 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 *
 * 示例 1：
 *
 * 输入: s1 = "abc", s2 = "bca"
 * 输出: true
 * 示例 2：
 *
 * 输入: s1 = "abc", s2 = "bad"
 * 输出: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/check-permutation-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author huangjianxiong
 * @Date 2020/6/23
 **/
public class IsEquals {

    public static void main(String[] args) {
        isEquals("bca", "cba");
        isEquals("bca", "bad");

    }

    public static void isEquals(String s1, String s2) {
        char[] array = s2.toCharArray();
        Arrays.sort(array);
        String newString = new String(array);
        char[] array2 = s2.toCharArray();
        Arrays.sort(array2);
        String newString2 = new String(array);
        System.out.println(array2.equals(array));
        System.out.println(newString.equals(newString2));
    }
}
