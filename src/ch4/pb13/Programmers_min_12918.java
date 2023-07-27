package ch4.pb13;

import java.util.ArrayList;

public class Programmers_min_12918 {

    public static void main(String[] args) {
        Programmers_min_12918 solution = new Programmers_min_12918();
        System.out.println(solution.solution("1234"));
    }


    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6){
            return false;
        }

        for (char c : s.toCharArray()){
            if (c < '0' || c > '9'){
                return false;
            }
        }

        return true;
    }

}
