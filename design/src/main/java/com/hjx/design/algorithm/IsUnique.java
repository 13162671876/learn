package com.hjx.design.algorithm;

import java.util.HashSet;

/**
 * @Desc实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 *
 * 示例 1：
 *
 * 输入: s = "leetcode"
 * 输出: false
 * 示例 2：
 *
 * 输入: s = "abc"
 * 输出: true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/is-unique-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author huangjianxiong
 * @Date 2020/6/23
 **/
public class IsUnique{

    public static void main(String[] args) {
        System.out.println(isExsitSameChar("adfghjkl"));
    }

    public static boolean isExsitSameChar(String str){
        boolean falg = false;
        HashSet set = new HashSet();
        char[] array = str.toCharArray();
        for (char c:array) {
            set.add(c);
        }
        if(set.size()==str.length())
        {
            falg = true;
        }
        return falg;
    }

}
