package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    static int Int(String name) {
        while (true) try {
            System.out.printf("Введите %s: ", name);
            Scanner sc = new Scanner(System.in);
            return sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Ошибка, введите целое число.");
        }
    }

    static double Double(String name) {
        while (true) try {
            System.out.printf("Введите %s: ", name);
            Scanner sc = new Scanner(System.in);
            return sc.nextDouble();
        } catch (InputMismatchException ex) {
            System.out.println("Ошибка, введите число.");
        }
    }

    static String String(String name) {
        System.out.printf("Введите %s: ", name);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static boolean Bool(String name){
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
