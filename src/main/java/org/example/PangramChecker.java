package org.example;

public class PangramChecker {
    public boolean check(String sentence){
        sentence = sentence.toLowerCase();
        String alphabet = "qewrtyuiopasdfghjklzxcvnmb";
        boolean answer = false;
        int counter = 0;
        for(int i = 0; i < alphabet.length();i++){
            if(sentence.contains(Character.toString(alphabet.charAt(i)))) counter++;
        }
        if(counter == 26) answer = true;
        return answer;
    }
}
