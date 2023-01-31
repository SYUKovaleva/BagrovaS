package com.max.idea;

import java.util.Scanner;

public class Cycle10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Создаём массив размером s на l
        System.out.println("Введите количество строк: ");
        int s = input.nextInt();
        System.out.println("Введите количество столбцов: ");
        int l = input.nextInt();
        int[][] array = new int[s][l];

        // Заполняем массив элементами, введёнными с клавиатуры
        System.out.println("Введите элемент массива: ");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < l; j++) {
                array[i][j] = input.nextInt();
            }
        }

        // Выводим первую строку массива умноженную на 3
        System.out.print ("Первая строка получившегося массива: ");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(" " + (array[i][j] * 3));
            }
        }
    }
}
