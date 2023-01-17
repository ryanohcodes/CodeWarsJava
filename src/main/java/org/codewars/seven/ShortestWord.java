package org.codewars.seven;

public class ShortestWord {
        public static int findShort(String s) {
            String[] words = s.split(" ");
            int shortest = 1000000;
            for(int i = 0; i < words.length;i++){
                int current = words[i].length();
                if(current < shortest) shortest = current;
            }
            return shortest;
        }
}
