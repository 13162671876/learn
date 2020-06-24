package com.hjx.design.algorithm;

/**
 * @Desc URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。（注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
 *
 * 示例1:
 *
 *  输入："Mr John Smith", 13
 *  输出："Mr%20John%20Smith"
 * 示例2:
 *
 *  输入："               ", 5
 *  输出："%20%20%20%20%20"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/string-to-url-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author huangjianxiong
 * @Date 2020/6/23
 **/
public class UrlBankConvert {
    public static void main(String[] args) {

    }
    private static void UrlBankConvert(String s, int length){
        char[] chars = s.toCharArray();
        for (char c:chars) {
            if(Character.isSpace(c)){
                chars[i] ='';
            }
        }
    }
}
