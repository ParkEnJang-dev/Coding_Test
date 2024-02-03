package baekjoon;

import java.util.Scanner;

public class Baek_2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int startIdx = 1;
        int endIdx = 1;
        int sum = 1;
        int count = 1;
        while (endIdx < N){
            if (sum == N){
                sum -= startIdx;
                startIdx++;
                count++;
            }else if (sum < N){
                endIdx++;
                sum += endIdx;
            }else if (sum > N){
                sum -= startIdx;
                startIdx++;
            }
        }
        System.out.println(count);
    }
}
