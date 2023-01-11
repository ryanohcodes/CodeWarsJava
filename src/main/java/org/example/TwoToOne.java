package org.example;

import java.util.Arrays;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        String combi = s1 + s2;
        String[] combiArr = combi.split("");
        String[] ans = Arrays.stream(combiArr).distinct().sorted().toArray(String[]::new);
        return String.join("",ans);
    }
}
