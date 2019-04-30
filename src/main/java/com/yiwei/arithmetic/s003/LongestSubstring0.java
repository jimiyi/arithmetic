package com.yiwei.arithmetic.s003;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring0 {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> cSet = new HashSet<>();
        int max = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!cSet.contains(s.charAt(j))) {
                cSet.add(s.charAt(j++));
                max = Math.max(max, j - i);
            } else {
                cSet.remove(s.charAt(i++));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        int max = lengthOfLongestSubstring(s);
        System.out.print(max);
    }
}
