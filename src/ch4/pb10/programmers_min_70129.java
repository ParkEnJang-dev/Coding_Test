package ch4.pb10;

public class programmers_min_70129 {
    //1. 문자열에 0을 제거한다.
    //2. 제거한0의 개수를 count한다.
    //3. 제거한 문자열의 길이를 이진법으로 변환한다.
    //4. 변환한 이진법의 길이를 return 한다.
    //5. 1~4를 반복한다.

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("01110");
    }

    static class Solution {

        int removeZeroCnt = 0;
        public int[] solution(String s) {

            int changeCnt = 0;
            String binaryResult = s;

            while (true){
                binaryResult = filterBinary(binaryResult);
                changeCnt += 1;
                if (binaryResult.equals("1")){
                    break;
                }
            }
            int[] answer = new int[]{changeCnt, removeZeroCnt};
            return answer;
        }

        public String filterBinary(String s) {
            String temp = s.replaceAll("0", "");
            String binary = Integer.toString(temp.length(), 2);

            removeZeroCnt += s.length() - temp.length();

            return binary;
        }
    }

}
