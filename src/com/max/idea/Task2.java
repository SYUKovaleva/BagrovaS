package com.max.idea;

import java.util.Objects;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите простое уравнение без пробелов с одним неизвестным Х: ");
        String stroka = input.nextLine();
        String[] array = stroka.split("");

        if (Objects.equals(array[0], "x") && Objects.equals(array[1], "+")) {
            System.out.println("Ответ: X=" + (Byte.parseByte(array[4]) - Byte.parseByte(array[2])));
        }
        else if (Objects.equals(array[0], "x") && Objects.equals(array[1], "-")) {
            System.out.println("Ответ: X=" + (Byte.parseByte(array[4]) + Byte.parseByte(array[2])));
        }
        else if (Objects.equals(array[2], "x") && Objects.equals(array[1], "+")) {
            System.out.println("Ответ: X=" + (Byte.parseByte(array[4]) - Byte.parseByte(array[0])));
        }
        else if (Objects.equals(array[2], "x") && Objects.equals(array[1], "-")) {
            System.out.println("Ответ: X=" + (Byte.parseByte(array[0]) - Byte.parseByte(array[4])));
        }
        else if (Objects.equals(array[4], "x") && Objects.equals(array[1], "+")) {
            System.out.println("Ответ: X=" + (Byte.parseByte(array[0]) + Byte.parseByte(array[2])));
        }
        else if (Objects.equals(array[4], "x") && Objects.equals(array[1], "-")) {
            System.out.println("Ответ: X=" + (Byte.parseByte(array[0]) - Byte.parseByte(array[2])));
        }
        else {
            System.out.println("Кажется, Вы ввели что-то не так... Проверьте ввод\n");
        }

        // Выводим на экран, полученный массив для наглядности
        System.out.print ("Ваше уравнение: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print (" " + array[i]);
        }
    }
}
