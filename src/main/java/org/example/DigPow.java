package org.example;

public class DigPow {

    public static long digPow(int n, int p) {
        //split int n into individual numbers
        String[] splitNum = Integer.toString(n).split("");
        //the first n will have a power of p, the next will increment
        long total = 0;
        for (String s : splitNum) {
            total += (long) Math.pow(Double.parseDouble(s), p);
            p++;
        }
        //take the total and divide it by the original n
        //if whole number then return that number
        if(total % n == 0){
            return total/n;
        }
        //else return -1
        return -1;
    }

}
