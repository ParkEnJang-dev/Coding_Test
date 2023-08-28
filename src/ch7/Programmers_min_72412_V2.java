package ch7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Programmers_min_72412_V2 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] list = {"java backend junior pizza 150", "python frontend senior chicken 210", "python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80", "python backend senior chicken 50"};
        String[] list2 = {"java and backend and junior and pizza 100", "python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250", "- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150"};
        solution.solution(list, list2);
    }

    static class Solution {
        public int[] solution(String[] info, String[] query) {
            Map<String, int[]> infoMap = new HashMap<>();
            for (String s : info) {

            }


            return null;
        }


    }

    private void addInfo(String s, Map<String, int[]> infos) {
        String[] personSpec = s.split(" ");
        String language = personSpec[0];
        String job = personSpec[1];
        String career = personSpec[2];
        String food = personSpec[3];
        int score = Integer.valueOf(personSpec[4]);

        ArrayList<String> languageList = new ArrayList<>();
        languageList.add(language);
        languageList.add("-");

        ArrayList<String> jobList = new ArrayList<>();
        jobList.add(job);
        jobList.add("-");

        ArrayList<String> careerList = new ArrayList<>();
        careerList.add(career);
        careerList.add("-");

        ArrayList<String> foodList = new ArrayList<>();
        foodList.add(food);
        foodList.add("-");

        for (String l : languageList) {
            for (String j : jobList) {
                for (String c : careerList) {
                    for (String f : foodList) {
                        String key = l + j + c + f;
                        if (!infos.containsKey(key)) {
                            infos.put(key, new int[]{score});
                        } else {
                            infos.get(key)[0] = score;
                        }
                    }
                }
            }
        }
    }
}
