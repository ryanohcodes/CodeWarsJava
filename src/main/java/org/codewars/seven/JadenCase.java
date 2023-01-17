package org.codewars.seven;

public class JadenCase {
    public String toJadenCase(String phrase) {
        if(phrase == null || phrase.isEmpty()) return null;

        String[] spliter = phrase.split(" ");
        for(int i = 0; i < spliter.length;i++){
            String temp = "";
            char cap = Character.toUpperCase(spliter[i].charAt(0));
            String rest = spliter[i].substring(1);
            temp = cap + rest;
            spliter[i] = temp;
        }
        return String.join(" ",spliter);
    }
}
