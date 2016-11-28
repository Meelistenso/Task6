package com.company;

import java.util.Map;

public class MapLogic {
    public static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

    public static void addWord(String word1, String word2, Map<String,String> map1, Map<String,String> map2){
        if (map1.containsKey(word1)||map2.containsKey(word2)) {
            if (!Main.inputBool("Ключ уже имеется, всё-равно добавить?"))
                return;
        }
        map1.put(word1,word2);
        map2.put(word2,word1);
    }

    public static String translate(String text, Map<String,String> map){
        StringBuilder res = new StringBuilder();
        text=text.concat(" ");
        int i=0, j=0;
        String sub,msub;

        while (j<text.length()) {
            if (text.charAt(j) == ' ') {
                sub=text.substring(i, j);
                msub=map.get(sub);
                if (msub!=null) res.append(msub).append(" ");
                else
                    res.append(sub).append(" ");
                j++;
                i=j;
            }
            j++;
        }
        return res.toString();
    }
}