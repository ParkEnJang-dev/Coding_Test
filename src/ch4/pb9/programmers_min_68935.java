package ch4.pb9;

public class programmers_min_68935 {
    // 1. 3진법으로 변환한다.
    // 2. 3진법을 뒤집는다.
    // 3. 10진법으로 변환한다.
    // 4. 10진법으로 변환한 수를 return 한다.

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(45);
    }

    static class Solution {

        public int solution(int n) {
            int answer = 0;
            String ternary = Integer.toString(n, 3);
            StringBuffer sb = new StringBuffer(ternary);
            String reverseTernary = sb.reverse().toString();
            answer = Integer.parseInt(reverseTernary, 3);
            return answer;
        }
    }

}
