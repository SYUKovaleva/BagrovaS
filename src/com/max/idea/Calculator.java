package com.max.idea;
import java.util.Objects;
import java.util.Scanner;
//Задание 5
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи первое число: ");
        int x = in.nextInt();
        System.out.println("Введите + или - или * или / ");
        var action = in.next();
        System.out.println("Введи второе число: ");
        int y = in.nextInt();
        if (Objects.equals(action, "+"))
            System.out.println(x+y);
        else if (Objects.equals(action, "-"))
            System.out.println(x-y);
        else if (Objects.equals(action, "*"))
            System.out.println(x*y);
        else if (Objects.equals(action, "/"))
            System.out.println(x/y);
        else
            System.out.println("Высшая математика не для этого калькулятора");
    }
}
