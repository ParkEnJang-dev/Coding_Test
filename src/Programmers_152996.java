import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.sort;

public class Programmers_152996 {
    public static void main(String[] args) {
        int[] weights = {100, 100, 180, 270, 360};

        Arrays.sort(weights);

        int totInt = 0;
        long result = 0;

        for (int i = 0; i < weights.length - 1; i++) {
            if (i != 0) {
                if (weights[i - 1] == weights[i]) {
                    totInt--;
                    result += totInt;
                    continue;
                }
            }
            totInt = 0;
            for (int j = i + 1; j < weights.length; j++) {
                if (weights[i] == weights[j] || weights[i] * 2 == weights[j]
                        || weights[i] * 3 == weights[j]
                        || weights[i] * 3 == weights[j] * 2
                        || weights[i] * 4 == weights[j]
                        || weights[i] * 4 == weights[j] * 2
                        || weights[i] * 4 == weights[j] * 3

                ) {
                    totInt++;
                }
            }
            result += totInt;
        }

        System.out.println(result);
    }
}
