package ch7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Programmers_min_12917 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("Zbcdefg");

    }

    static class Solution {
        public String solution(String s) {
            String answer = "";
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            answer = new StringBuilder(new String(chars)).reverse().toString();
            return answer;
        }
    }
}
