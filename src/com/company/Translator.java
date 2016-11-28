package com.company;

public class Translator {
    static String translate(String text, Direction dir){
        StringBuilder res = new StringBuilder();
        text=text.concat(" ");
        int i=0, j=0;

        while (j<text.length()) {
            if (text.charAt(j) == ' ') {
                res.append(Dictionary.translateWord(dir,text.substring(i, j))).append(" ");
                j++;
                i=j;
            }
            j++;
        }
        return res.toString();
    }
}
