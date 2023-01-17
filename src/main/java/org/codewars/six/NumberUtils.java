package org.codewars.six;

public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        //get length of the number
        String thisNum = Integer.toString(number);
        int numberLength = thisNum.length();
        //raise each number to that length
        String[] splitString = thisNum.split("");
        double total = 0;
        for (String s : splitString) {
            total += Math.pow(Double.parseDouble(s), numberLength);
        }
        //add the numbers
        //see if it equals the original
        return number == (int) total;
    }

}