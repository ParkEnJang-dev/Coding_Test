package ch7;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Programmers_min_12915 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = solution.solution(new String[]{"sun", "bed", "car"}, 1);
    }

    static class Solution {
        public String[] solution(String[] strings, int n) {

            Point[] points = new Point[strings.length];
            String[] answer = new String[strings.length];

            for (int i = 0 ; i < strings.length ; i++){
                
                points[i] = new Point(strings[i], strings[i].charAt(n));
            }

            Arrays.sort(points, new Comparator<Point>() {
                @Override
                public int compare(Point o1, Point o2) {
                    if (o1.y == o2.y){
                        return o1.x.compareTo(o2.x);
                    } else {
                        return o1.y - o2.y;
                    }
                }

            });

            for (int i = 0 ; i < points.length ; i++){
                answer[i] = points[i].x;
            }

            return answer;
        }



        public class Point{
            public String x;
            public char y;

            Point(String x, char y){
                this.x = x;
                this.y = y;
            }
        }
    }
}
