package com.company;

import java.util.HashMap;
import java.util.Map;

enum Direction{
    RU_EN,
    EN_RU
}

public class Dictionary {

   static Map<String,String> ru_en = new HashMap<>();
   static Map<String,String> en_ru = new HashMap<>();

    static {
        ru_en.put("1","10");
        ru_en.put("2","9");
        ru_en.put("3","8");
        ru_en.put("4","7");
        ru_en.put("5","6");
        ru_en.put("6","5");
        ru_en.put("7","4");
        ru_en.put("8","3");
        ru_en.put("9","2");
        ru_en.put("10","1");

        en_ru.put("1","10");
        en_ru.put("2","9");
        en_ru.put("3","8");
        en_ru.put("4","7");
        en_ru.put("5","6");
        en_ru.put("6","5");
        en_ru.put("7","4");
        en_ru.put("8","3");
        en_ru.put("9","2");
        en_ru.put("10","1");
    }

    public static void addWord(String ru, String en){
        if (containsTranslation(Direction.RU_EN, ru)||containsTranslation(Direction.EN_RU, en)) {
            if (!Input.Bool("Ключ уже имеется, всё-равно добавить?"))
                return;
        }
        ru_en.put(ru,en);
        en_ru.put(en,ru);
    }

    static String translateWord(Direction dir,String word)
    {
        switch (dir) {
            case EN_RU:
                if (containsTranslation(Direction.EN_RU,word)) return en_ru.get(word);
                else return word;
            case RU_EN:
                if (containsTranslation(Direction.RU_EN,word)) return ru_en.get(word);
                else return word;
            default:
                throw new EnumConstantNotPresentException(Direction.class,"No such dir in translateWord()");
        }
    }

    static void printMap(Direction dir) {
        switch (dir) {
            case EN_RU:
                for (Map.Entry<String, String> entry : en_ru.entrySet()) {
                    System.out.println(entry);
                }
                break;
            case RU_EN:
                for (Map.Entry<String, String> entry : ru_en.entrySet()) {
                    System.out.println(entry);
                }
                break;
            default:
                throw new EnumConstantNotPresentException(Direction.class,"No such dir in printMap()");
        }
    }

    static boolean containsTranslation(Direction dir,String word){
        switch (dir) {
            case EN_RU:
                return en_ru.containsKey(word);
            case RU_EN:
                return ru_en.containsKey(word);
            default:
                throw new EnumConstantNotPresentException(Direction.class,"No such dir in containsTranslation()");
        }
    }
}
