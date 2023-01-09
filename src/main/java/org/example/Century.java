package org.example;

public class Century {
        public static int century(int number) {
            if(number <= 100) return 1;
            double current = (double) number/100;
            if(current - (int) number/100 == 0) return (int) current;
            else{
                return (int) Math.floor(current+ 1);
            }
        }
}
