package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek_11659 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();


        int[] nList = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            int sum = nList[i - 1] + sc.nextInt();
            nList[i] = sum;
        }

        for (int k = 0; k < m; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            System.out.println(nList[j]-nList[i-1]);
        }
    }
}
