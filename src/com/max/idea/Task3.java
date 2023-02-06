package com.max.idea;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите количество строк: ");
        int s = input.nextInt();
        String[] array = new String[s];

        // Заполняем массив элементами, введёнными с клавиатуры
        for (int i = 0; i < s; i++) {
            System.out.printf("Введите сторку %d: ", (i + 1));
            array[i] = input.next();
        }

        // Считаем количество символов в каждой строке и вычисляем максимум
        Long[] calc = new Long[s];
        long max = 0;
        for (int i = 0; i < s; i++) {
            calc[i] = array[i].chars().distinct().count();
            max = Math.max(calc[i], max);
        }

        // Выводим строку с максимальным кол-вом символов
        for (int i = 0; i < s; i++)
            if (calc[i] == max) {System.out.print("Ваша строка с максимальным кол-вом символов: " + array[i]);break;}
    }
}