package ch7;

import java.util.*;

public class Programmers_min_72412 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] list = {"java backend junior pizza 150", "python frontend senior chicken 210", "python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80", "python backend senior chicken 50"};
        String[] list2 = {"java and backend and junior and pizza 100", "python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250", "- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150"};
        solution.solution(list, list2);
    }

    static class Solution {
        public int[] solution(String[] info, String[] query) {
            ArrayList<Person> people = new ArrayList<>();
            int answerCnt = 0;
            int[] answer = new int[6];
            for (String s : info) {
                String[] personSpec = s.split(" ");
                Person person
                        = new Person(personSpec[0],
                        personSpec[1],
                        personSpec[2],
                        personSpec[3],
                        Integer.valueOf(personSpec[4]));
                people.add(person);
            }

            for (String s : query) {
                String[] queryCondition = s.split(" and ");

                int personCnt = 0;
                for (Person person : people) {
                    String[] foodScore = queryCondition[3].split(" ");

                    if ((person.language.equals(queryCondition[0]) || queryCondition[0].equals("-"))
                            && (person.job.equals(queryCondition[1]) || queryCondition[1].equals("-"))
                            && (person.career.equals(queryCondition[2]) || queryCondition[2].equals("-"))
                            && (person.food.equals(foodScore[0]) || foodScore[0].equals("-"))
                            && person.score >= Integer.valueOf(foodScore[1])
                    ) {
                        personCnt++;
                    }
                }
                answer[answerCnt] = personCnt;
                answerCnt++;
            }
            for (int a : answer){
                System.out.println(a);
            }


            return answer;
        }


        class Person {
            String language;
            String job;
            String career;
            String food;
            int score;

            Person(String language, String job, String career, String food, int score) {
                this.language = language;
                this.job = job;
                this.career = career;
                this.food = food;
                this.score = score;
            }
        }
    }
}
