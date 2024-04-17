package baekjoon;

import java.util.Scanner;

public class Baek_24051 {
    static int A;
    static int K;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        K = sc.nextInt();

        cal(sc);

    }

    public static void cal(Scanner sc){
        int[] arr = new int[A];
        for (int i = 0; i < A; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < A; i++) {
            Integer temp = null;
            for (int j = i; j > 0; j--) {

                if (arr[j - 1] > arr[j]) {
                    K--;
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                if (K == 0){
                    System.out.println(temp);
                    return ;
                }
            }

            if (temp != null) {
                K--;
            }
            if (K == 0){
                System.out.println(temp);
                return ;
            }


        }

        System.out.println(-1);
    }
}
