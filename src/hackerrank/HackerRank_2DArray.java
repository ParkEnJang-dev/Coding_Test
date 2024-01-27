package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HackerRank_2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;

        System.out.println(sum);



        List<List<Integer>> arrayLists = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(-1, -1, -1, -1, -1, -1));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(-1, -1, -1, -1, -1, -1));
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(-1, -1, -1, -1, -1, -1));
        ArrayList<Integer> arr4 = new ArrayList<>(Arrays.asList(-1, -1, -1, -1, -1, -1));
        ArrayList<Integer> arr5 = new ArrayList<>(Arrays.asList(-1, -1, -1, -1, -1, -1));
        ArrayList<Integer> arr6 = new ArrayList<>(Arrays.asList(-1, -1, -1, -1, -1, -1));
        arrayLists.add(arr1);
        arrayLists.add(arr2);
        arrayLists.add(arr3);
        arrayLists.add(arr4);
        arrayLists.add(arr5);
        arrayLists.add(arr6);

        hourglassSum(arrayLists);
    }

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here

        Integer max = null;
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 6; y++) {
                if (x > 3 || y > 3) {
                    continue;
                }

                int sum = calHouglassSum(x, y, arr);

                if (max == null){
                    max = sum;
                }else if (max < sum){
                    max = sum;
                }
            }
        }

        System.out.println("max " + max);

        return 0;
    }

    public static int calHouglassSum(
            int startX,
            int startY,
            List<List<Integer>> arr
    ) {
        int sum = 0;

        for (int x = startX; x < startX + 3; x++) {
            for (int y = startY; y < startY + 3; y++) {
                if (y - startY == 1 && x - startX == 0) {
                    continue;
                } else if (y - startY == 1 && x - startX == 2) {
                    continue;
                }

                sum += arr.get(y).get(x);
            }
        }


        return sum;
    }
}
