package ch9;

import java.util.HashSet;
import java.util.Set;

public class Programmers_min_120875 {

    public static void main(String[] args) {
        Programmers_min_120875 solution = new Programmers_min_120875();
//        int solution1 = solution.solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}});
//        int solution1 = solution.solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}});
        int solution1 = solution.solution(new int[][]{{1, 1}, {2, 2}, {3, 3}, {50, 100}});
        System.out.println(solution1);
    }

    public int solution(int[][] dots) {
        Set<Double> hashSet = new HashSet<>();
        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                int x = dots[j][0] - dots[i][0];
                int y = dots[j][1] - dots[i][1];

                if (hashSet.contains((double)x / y)) {
                    return 1;
                }

                hashSet.add((double)x / y);
            }
        }

        return 0;
    }
}
