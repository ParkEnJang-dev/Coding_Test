package ch9;

import java.util.HashSet;
import java.util.Set;

public class Programmers_min_120875 {

    public static void main(String[] args) {
        Programmers_min_120875 solution = new Programmers_min_120875();
        int solution1 = solution.solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}});
//        int solution1 = solution.solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}});
        System.out.println(solution1);
    }

    public int solution(int[][] dots) {
        Set<Double> set = new HashSet<>();
        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                int x = Math.abs(dots[i][0] - dots[j][0]);
                int y = Math.abs(dots[i][1] - dots[j][1]);

                if (set.contains((double)y / x)) {
                    return 1;
                }

                set.add((double)y / x);
            }
        }

        return 0;
    }
}
