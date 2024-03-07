package baekjoon;

import java.util.Scanner;

public class Baek_1940 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //재료의 개수
        int N = sc.nextInt();

        int[] arr = new int[N];

        //갑옷을 만드는데 필요한 수
        int M = sc.nextInt();

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {

                if (arr[i]+arr[j]==M){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);


    }
}
