package org.example;

public class XO {
    public static boolean getXO (String str) {
        str = str.toLowerCase();
        int oCounter = 0;
        int xCounter = 0;
        for(int i =0; i < str.length();i++){
            if(str.charAt(i) == 'o') oCounter++;
            else if(str.charAt(i) == 'x') xCounter++;
        }
        return oCounter == xCounter;
    }
}
