package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Baek_1874 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        List<String> result = new ArrayList<>();

        int k = 1;
        stack.push(k);
        result.add("+");
        for (int i = 0 ; i < n ; i++){
            int num = sc.nextInt();

            if (stack.isEmpty() || stack.peek() < num){
                while (k < num) {
                    k++;
                    stack.push(k);
                    result.add("+");
                }
            }
            if (stack.peek() == num){
                stack.pop();
                result.add("-");
            }else {
                System.out.println("NO");
                break;
            }
        }

        if (stack.isEmpty()){
            result.stream().forEach(System.out::println);
        }



    }


}
