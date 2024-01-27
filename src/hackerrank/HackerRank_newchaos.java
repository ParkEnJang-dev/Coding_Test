package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRank_newchaos {
    public static void main(String[] args) {
        List<Integer> queue = List.of(2, 1, 5, 3, 4);
        List<Integer> queuev2 = List.of(5, 1, 2, 3, 7, 8, 6, 4);
//        minimumBribes(queuev2); // 예상 출력: 3
        minimumBribesV2(queuev2);
    }

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int bride = 0;

        for (int i = 0; i < q.size(); i++) {
            Integer curIdx = q.get(i);
            if (curIdx - (i + 1) > 0 ){
                bride += curIdx - (i + 1);
                if (bride > 3){
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(bride);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.stream().forEach(test -> {


        });

    }

    public static void minimumBribesV2(List<Integer> q) {
        // Write your code here
        int totalBribes = 0;

        for (int i = q.size() - 1; i >= 0; i--) {
            if (q.get(i) - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q.get(i) - 2); j < i; j++) {
                if (q.get(j) > q.get(i)) totalBribes++;
            }
        }

        System.out.println(totalBribes);

    }
}
