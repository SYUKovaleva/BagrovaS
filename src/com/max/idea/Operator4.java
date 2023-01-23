package com.max.idea;

import java.util.Scanner;
public class Operator4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Задание 4.1
        System.out.println("Введи число Х: ");
        int x = in.nextInt();
        System.out.println("Введи число У: ");
        int y = in.nextInt();
        System.out.println("Введи число Z: ");
        int z = in.nextInt();
        //Задание 4.2
        int sa = (x + y + z) / 3;
        System.out.println("Среднее арифметическое: " + sa);
        //Задание 4.3
        int okr = sa/2;
        System.out.println("Разделили на два и округлили: " + okr);
        //Задание 4.4
        if (okr > 3 )
            System.out.println("Программа выполнена корректно");
        else
            System.out.println("Ошибка!");
    }
}