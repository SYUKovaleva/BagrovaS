package com.max.idea;

import java.util.Scanner;

public class Dannie13 {
    public static void main(String[] args) {
        // Пользователь должен ввести строку из слов, разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”
        Scanner input = new Scanner(System.in);

        System.out.println("Введите строку из слов, разделенных пробелами: ");
        String stroka = input.nextLine();
        String[] array = stroka.split(" ");

        //Выведите слова, состоящие только из латиницы
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].matches("^[a-zA-Z0-9]+$")) {
                sum += 1;
                System.out.print (" " + array[i]);}
        }

        //Выведите количество этих слов
        System.out.print ("\nКоличество латинских слов: " + sum);
    }
}