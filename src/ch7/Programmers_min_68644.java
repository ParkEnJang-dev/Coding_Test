package ch7;

import java.util.ArrayList;
import java.util.Collections;

public class Programmers_min_68644 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{2, 1, 3, 4, 1}));

    }

    static class Solution {
        public int[] solution(int[] numbers) {
            int[] answer = {};
            ArrayList<Integer> arrList = new ArrayList<>();

            //treeSet을 쓰면 중복을 제거하고, 정렬까지 해준다.
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {

                    int temp = numbers[i] + numbers[j];

                    if (!arrList.contains(temp)){
                        arrList.add(temp);
                    }

                }
            }
            Collections.sort(arrList);
//            arrList.stream().forEach(System.out::println);

            return arrList.stream().mapToInt(i -> i).toArray();
        }
    }
}
