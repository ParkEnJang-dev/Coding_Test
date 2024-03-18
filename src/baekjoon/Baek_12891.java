package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_12891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int[] myArr = new int[4];
        char[] dnaStr = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            myArr[i] = Integer.parseInt(st.nextToken());
        }

        int A = myArr[0];
        int C = myArr[1];
        int G = myArr[2];
        int T = myArr[3];
        int cntA = A;
        int cntC = C;
        int cntG = G;
        int cntT = T;

        int totCnt = 0;

        for (int i = 0; i < P; i++) {
            if (dnaStr[i] == 'A') {
                cntA--;
            } else if (dnaStr[i] == 'C') {
                cntC--;
            } else if (dnaStr[i] == 'G') {
                cntG--;
            } else if (dnaStr[i] == 'T') {
                cntT--;
            }
        }

        if (cntA <= 0 && cntC <= 0 && cntG <= 0 && cntT <= 0) {
            totCnt++;
        }


        for (int j = 0; j < S - P; j++) {
            int start = j;
            int end = P + j;
            if (dnaStr[start] == 'A') {
                cntA++;
            } else if (dnaStr[start] == 'C') {
                cntC++;
            } else if (dnaStr[start] == 'G') {
                cntG++;
            } else if (dnaStr[start] == 'T') {
                cntT++;
            }

            if (dnaStr[end] == 'A') {
                cntA--;
            } else if (dnaStr[end] == 'C') {
                cntC--;
            } else if (dnaStr[end] == 'G') {
                cntG--;
            } else if (dnaStr[end] == 'T') {
                cntT--;
            }

            if (cntA <= 0 && cntC <= 0 && cntG <= 0 && cntT <= 0) {
                totCnt++;
            }

        }
        System.out.println(totCnt);

    }
}
