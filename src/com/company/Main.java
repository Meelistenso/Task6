package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<User> users=new ArrayList<User>();

        while(true){
            switch(Input.String("команду").toLowerCase()){
                case "translate":
                    System.out.println(Translator.translate(Input.String("текст"),Input.Bool("ru-en - да, en-ru - нет: ")?Direction.RU_EN:Direction.EN_RU));break;
                case "printmap":
                    Dictionary.printMap(Input.Bool("ru-en - да, en-ru - нет: ")?Direction.RU_EN:Direction.EN_RU);
                case "printall":
                    System.out.println(users.toString()); break;
                case "adduser":
                    users.add(new User(Input.String("имя"), Input.String("номер"), UserLogic.inputTelType("тип подключения"), Input.String("адрес"))); break;
                case "deleteuser" :
                    UserLogic.delByNumber(Input.String("номер"),users);break;
                case "search":
                    System.out.println(UserLogic.findByName(Input.String("имя"),users)); break;
                case "addword":
                    Dictionary.addWord(Input.String("RU"),Input.String("EN"));break;
                default:
                    System.out.println("Доступні команди: printAll, addUser, deleteUser, search, translate, printMap, addWord");
            }
        }
    }


}