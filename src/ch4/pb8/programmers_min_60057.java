package ch4.pb8;

import java.util.ArrayList;
import java.util.List;

public class programmers_min_60057 {

    //1.문자를 개수 단위로 잘라야한다.
    //2.잘라서 압축한 문자열 중 가장 짧은 것의 길이를 return 한다.
    //3.문자열의 길이는 1이상 1000이하이다.
    //4.문자열은 알파벳 소문자로만 이루어져 있다.

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("ababcdcdababcdcd");
    }

    static class Solution {

        public int solution(String s) {
            int min = 1000;
            for (int length = 1; length <= s.length(); length++) {

                List<String> list = new ArrayList<>();
                for (int startIdx = 0; startIdx < s.length(); startIdx += length) {
                    int endIdx = length + startIdx;
                    if (endIdx > s.length()) endIdx = s.length();
                    list.add(s.substring(startIdx, endIdx));
                }

                String prev = "";
                int count = 0;
                StringBuilder sb = new StringBuilder();
                for (String item : list) {
                    if (item.equals(prev)) {
                        count++;
                    } else {
                        if (count > 1) sb.append(count);
                        sb.append(prev);
                        prev = item;
                        count = 1;
                    }
                }

                if (count > 1) sb.append(count);
                sb.append(prev);
                if (min > sb.length()) min = sb.length();
            }
            System.out.println(min);

            return min;

        }
    }

}
