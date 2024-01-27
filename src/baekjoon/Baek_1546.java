package baekjoon;

import java.util.Scanner;

public class Baek_1546 {
    public static void main(String[] args) {
        //1. 최고의 점수를 구한다.
        //2. 점수/m*100
        //3. (각점수/m)*100) / N
        // 상대오차 , 절대오차 개념


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double[] testScores =  new double[num];
        double maxScore = 0;
        double avrTotalScore = 0;

        for (int i = 0; i < num; i++) {
            double cur= sc.nextInt();
            testScores[i] = cur;
            if (maxScore < cur) maxScore = cur;
        }

        for (double score : testScores){
            double avrScore = (score/maxScore) * 100;
            avrTotalScore += avrScore;
        }

        avrTotalScore = avrTotalScore / num;

        System.out.println(avrTotalScore);


    }
}
