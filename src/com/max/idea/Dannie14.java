package com.max.idea;

import java.util.Random;

public class Dannie14 {
    public static void main(String[] args) {
        // Создаём массив с рандомными значениями от -20 до 20 размером 15 элементов
        Random random = new Random();
        int[] array = new int[15];

        for (int i = 0; i < 15; i++) {
            array[i] = random.nextInt(20 + 20) - 20;
        }

        // Выведите максимальный элемент массива
        int max = array[0];
        for (int j : array) {
            if (j > max)
                max = j;
        }
        System.out.println("Максимальное число: " + max);

        // Выведите минимальный элемент массива
        int min = array[0];
        for (int g : array) {
            if (g < min)
                min = g;
        }
        System.out.println("Минимальное число: " + min);

        // Из максимального и минимального значения выведите наибольшее по модулю
        int a = Math.abs(max);
        int b = Math.abs(min);
        int result = Math.max(a, b);
        System.out.println("Наибольшее по модулю: " + result);

        // Выводим на экран, полученный массив для визуальной проверки
        System.out.print ("Ваш массив: ");
        for (int i = 0; i < 15; i++) {
            System.out.print (" " + array[i]);
        }

    }
    }

