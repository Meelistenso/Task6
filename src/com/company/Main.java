package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users=new ArrayList<User>();

        Map<String,String> ru_en = new HashMap<>();
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
        Map<String,String> en_ru = new HashMap<>();
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

        while(true){
            switch(inputString("").toLowerCase()){
                case "translate":System.out.println(MapLogic.translate(inputString("текст"), (inputBool("ru-en - да, en-ru - нет: ")?ru_en:en_ru)));break;
                case "printmap":MapLogic.printMap(inputBool("ru-en - да, en-ru - нет: ")?ru_en:en_ru);
                case "printall":
                    System.out.println(users.toString()); break;
                case "adduser": users.add(new User(inputString("имя"), inputString("номер"), UserLogic.inputTelType("тип подключения"), inputString("адрес"))); break;
                case "deleteuser" : UserLogic.delByNumber(inputString("номер"),users);break;
                case "search":
                    System.out.println(UserLogic.findByName(inputString("имя"),users)); break;
                default:
                    System.out.println("Доступні команди: printAll, addUser, deleteUser, search, translate, printmap");
            }
        }
    }

    static int inputInt(String name) {
        while (true) try {
            System.out.printf("Введите %s: ", name);
            Scanner sc = new Scanner(System.in);
            return sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Ошибка, введите целое число.");
        }
    }

    static double inputDouble(String name) {
        while (true) try {
            System.out.printf("Введите %s: ", name);
            Scanner sc = new Scanner(System.in);
            return sc.nextDouble();
        } catch (InputMismatchException ex) {
            System.out.println("Ошибка, введите число.");
        }
    }

    static String inputString(String name) {
        System.out.printf("Введите %s: ", name);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static boolean inputBool(String name){
        while (true) try {
            System.out.printf(name);
            Scanner sc = new Scanner(System.in);
            String b = sc.next();
            if (b.equalsIgnoreCase("да")) return true;
            else if (b.equalsIgnoreCase("нет")) return false;
            else throw new InputMismatchException();
        } catch (InputMismatchException ex) {
            System.out.println("Ошибка, введите да или нет.");
        }
    }
}