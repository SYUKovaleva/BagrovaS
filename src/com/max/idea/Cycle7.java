package com.max.idea;

import java.util.Arrays;
import java.util.Scanner;

public class Cycle7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int s = input.nextInt();
        int[] array = new int[s]; // Создаём массив размером s

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < s; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }

        //Задаём константы
        int x = 1;
        int y = 2;
        int z = 3;

        //Сравниваем элементы массива с константами
        for (int i = 0; i < s; i++) {
           if (array[i] == x || array[i] == y || array[i] == z) {
               System.out.println("Данное значение имеется в константах!");
           }
        }

        // Выводим на экран, полученный массив
        System.out.print ("Ваш массив: ");
        for (int i = 0; i < s; i++) {
            System.out.print (" " + array[i]);
        }
    }
    }

