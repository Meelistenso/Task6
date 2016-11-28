package com.company;

import java.util.ArrayList;
import java.util.List;

public class UserLogic {

    public static List<User> findByName(String name, List<User> users){
        List<User> res=new ArrayList<>();
        for (User u:users) {
            if (u.getName().contains(name)) res.add(u);
        }
        return res;
    }

    public static User delByNumber(String number,List<User> users){
        for (User u:users) {
            if (u.getPhone().equalsIgnoreCase(number)) users.remove(users.indexOf(u));
        }
        return null;
    }

    static User.TelType inputTelType(String text) {
        while (true) {
            try {
                return User.TelType.valueOf(Input.String(text).toLowerCase());
            } catch (IllegalArgumentException ex) {
                System.out.println("Ошибка. [individual, twin, shared]");
            }
        }
    }
}
