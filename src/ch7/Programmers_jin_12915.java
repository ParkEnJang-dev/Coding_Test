package ch7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programmers_jin_12915 {
    public String[] solution(String[] strings, int n) {
        List<String> stringList = Arrays.asList(strings);

        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(n) - o2.charAt(n);
            }
        });

        return stringList.toArray(new String[stringList.size()]);



    }
}
