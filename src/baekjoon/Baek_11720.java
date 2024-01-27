package baekjoon;

import java.util.Scanner;

public class Baek_11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String numstring = sc.next();
        int total = 0;

        for (int i = 0; i < numstring.length(); i++) {
            int a = numstring.charAt(i) - 48;
            total+= a;
        }
        System.out.println(total);
    }
}
