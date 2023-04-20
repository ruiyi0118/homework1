package com.ksyun.whgc.yinruiyi;

import java.util.HashMap;
import java.util.Map;

public class StringUtils {

    // 反转字符串
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    // 统计字符串中每个字母出现的次数
    public static Map<Character, Integer> countLetters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
