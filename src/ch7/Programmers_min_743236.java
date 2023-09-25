package ch7;

import java.util.*;
import java.util.stream.Collectors;

public class Programmers_min_743236 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(25, new int[]{2, 14, 11, 21, 17}, 2);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int distance, int[] rocks, int n) {

            int mid = 0;
            int start = 1;
            Arrays.sort(rocks);

            while (start <= distance){
                mid = start + distance / 2;


            }

            System.out.println(mid);
            int answer = 0;
            return answer;
        }
    }
}
