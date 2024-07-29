package baekjoon;

import java.util.Map;
import java.util.Scanner;

public class Baek_4779 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int N = sc.nextInt();
        int N = 3;

        int pow = (int) Math.pow(3, N);

        System.out.println(pow/3);
        String[] str = new String[pow];
        for (int i = 0; i < pow; i++) {
            str[i] = "-";
        }
        for (int i = 0; i < pow; i++) {
            System.out.print(str[i]);
        }

    }

    //재귀
    //분할 정복

}
