package org.codewars.six;

public class SpinWords {

        public String spinWords(String sentence) {
            //break the String into String[]
            String[] answer = sentence.split(" ");
            //iterate over the array;
            for(int i = 0; i < answer.length;i++){
                //if word is 5 or more characters
                if(answer[i].length() >= 5){
                    answer[i] = new StringBuffer(answer[i]).reverse().toString();
                }
            }
            //stitch it back together
            return String.join(" ", answer);
        }
}
