package ch7;

import java.util.*;

public class Programmers_min_72411 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
        int[] course = new int[]{2, 3, 4};
        solution.solution(result, course);
    }

    static class Solution {
        public String[] solution(String[] orders, int[] course) {
            //1. 첫번째 인덱스 부터 첫 원소
            ArrayList<FoodCourse> foodCourses = new ArrayList<>();

            for (int i = 0; i < orders.length - 1; i++) {

                //첫번째 인덱스, 첫번째 원소 부터시작
                for (int k = i + 1; k < orders.length; k++) {
                    StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < orders[i].length(); j++) {
                        char c = orders[i].charAt(j);

//                        System.out.print("|" + c + "|");

                        if (orders[k].contains(String.valueOf(c))) {
                            sb.append(c);
                        }

                    }
                    System.out.println(sb.toString());
                    selectFoodCourse(sb.toString(), foodCourses);
                }
            }
            /*String[] answer = foodCourses.stream().filter(s -> {
                for (int i : course) {
                    if (s.length() == i) {
                        return true;
                    }
                }
                return false;
            }).toArray(String[]::new);

            Arrays.sort(answer);*/

            for (FoodCourse foodCourse : foodCourses) {
                System.out.println(foodCourse.course + " " + foodCourse.count);
            }

            return null;
        }

        public void selectFoodCourse(String curCourse, ArrayList<FoodCourse> foodCourses) {
            if (curCourse.length() < 2) {
                return;
            }
            char[] chars = curCourse.toCharArray();
            Arrays.sort(chars);
            curCourse = new String(chars);

            for (FoodCourse foodCourse : foodCourses) {
                if (foodCourse.course.equals(curCourse)) {
                    foodCourse.count++;
                    return;
                }
            }

            foodCourses.add(new FoodCourse(curCourse, 1));
        }

        static class FoodCourse {
            String course;
            int count;

            FoodCourse(String course, int count) {
                this.course = course;
                this.count = count;
            }
        }

    }

}
