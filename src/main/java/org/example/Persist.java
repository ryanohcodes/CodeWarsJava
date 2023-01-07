package org.example;
// learned how to turn a string into a Long and a long into a string
// type casting gets rid of lossy conversion
class Persist {
    public static int persistence(long n) {
        if(n < 10) return 0;
        String[] num = Long.toString(n).split("");
        int counter = 0;
        while(num.length > 1){
            counter++;
            long total = 1;
            for(int i = 0; i < num.length;i++){
                total *= Long.parseLong(num[i]);
            }
            num = Long.toString(total).split("");
        }
        return counter;
    }
}
