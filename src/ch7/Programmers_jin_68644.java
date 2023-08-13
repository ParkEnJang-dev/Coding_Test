package ch7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_jin_68644 {
    public int[] solution(int[] numbers) {
        int size = numbers.length;
        List<Integer> answers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int sum = numbers[i] + numbers[j];
                if(!answers.contains(sum)) answers.add(sum);
            }
        }
        int[] answer = answers.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        Arrays.sort(answer);
        return answer;
    }
}
