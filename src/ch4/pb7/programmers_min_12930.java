package ch4.pb7;

import java.util.Arrays;

public class programmers_min_12930 {

    //공백 기준으로 짝수 판단.
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("try hello world");
    }

    static class Solution {
        public String solution(String s) {
            StringBuilder answer = new StringBuilder();

            char[] chars = s.toCharArray();
            boolean isUp = true;

            for (char c : chars) {
                if (c == ' ') {
                    answer.append(" ");
                    isUp = true;
                } else {
                    if (isUp) {
                        answer.append(Character.toUpperCase(c));
                        isUp = false;
                    }else {
                        answer.append(Character.toLowerCase(c));
                        isUp = true;
                    }
                }
                //이렇게도 풀 수 있네.
                //isUp = !isUp;
            }
            return answer.toString();
        }
    }

}
