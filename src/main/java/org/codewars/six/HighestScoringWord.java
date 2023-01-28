package org.codewars.six;

public class HighestScoringWord {

        public static String high(String s) {
            String[] words = s.split(" ");
            int max = 0;
            int pos = 0;
            for(int i = 0; i < words.length;i++){
                int temp = 0;
                for(int j = 0; j < words[i].length(); j++){
                    temp += words[i].charAt(j)-96;
                }
                System.out.println(temp);
                if(max < temp){
                    max = temp;
                    pos = i;
                }
            }
            return words[pos];
        }

}
