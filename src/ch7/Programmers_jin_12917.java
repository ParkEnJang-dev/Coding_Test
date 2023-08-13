package ch7;

import java.util.Arrays;

public class Programmers_jin_12917 {
    public String solution(String s) {
        char[] chaArr = s.toCharArray();
        char[] reverseChaArr = new char[chaArr.length];
        Arrays.sort(chaArr);
        for (int i = 0; i < chaArr.length; i++) {
            reverseChaArr[i] = chaArr[chaArr.length-1-i];
        }
        String answer = new String(reverseChaArr);
        return answer;

//        char[] sol = str.toCharArray();
//        Arrays.sort(sol);
//        return new StringBuilder(new String(sol)).reverse().toString();
    }
}
