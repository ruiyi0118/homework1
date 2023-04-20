package com.ksyun.whgc.yinruiyi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    // 打印出现次数最多的字母及其次数
    public static void printMostFrequentLetters(String s) {
        Map<Character, Integer> map = countLetters(s);
        int maxCount = 0;
        char maxChar = '\0';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println("出现次数最多的字母是：" + maxChar + "，它出现了 " + maxCount + " 次。");
    }

    // 返回不含有重复字符的最长子串
    public static String longestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        String longest = "";
        int i = 0, j = 0;
        while (j < n) {
            char c = s.charAt(j);
            if (!set.contains(c)) {
                set.add(c);
                j++;
                if (j - i > longest.length()) {
                    longest = s.substring(i, j);
                }
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return longest;
    }
}
