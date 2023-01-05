package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String word = Integer.toString(493193);
        while(word.length() > 1){
            String[] current = word.split("");
            int number = Arrays.stream(current).map(Integer::parseInt).reduce(0, Integer::sum);
            word = Integer.toString(number);
        }
        System.out.println(word.getClass().getSimpleName().equals("String"));
        //testing zone
        SpinWords ans = new SpinWords();
        System.out.println(ans.spinWords("Hey fellow warriors"));
        System.out.println(XO.getXO("xxoo"));
    }


}