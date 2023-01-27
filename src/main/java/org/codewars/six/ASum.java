package org.codewars.six;

public class ASum {
    public static long findNb(long m) {
        long start = 1;
        long counter = 0;
        while(m > 0){
            m -= (long) Math.pow(start,3);
            start++;
            counter++;
        }
        if(m < 0) counter--;
        return m < 0 ? -1 : counter;
    }
}
