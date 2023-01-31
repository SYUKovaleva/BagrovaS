package com.max.idea;

import java.util.Scanner;

public class Cycle9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Создаём массив размером s
        System.out.println("Введите размер массива: ");
        int s = input.nextInt();
        double[] array = new double[s];

        // Заполняем массив элементами, введёнными с клавиатуры
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < s; i++) {
            array[i] = input.nextDouble();
        }

        // Считаем среднее арифметическое элементов массива
        double average = 0;
        double sum = 0;
        for (int i = 0; i < s; i++) {
            sum += array[i];
        }
        average = sum / s;

        // Выводим на экран массив умножая каждый элемент на среднее арифметическое
        System.out.print ("Получился массив: ");
        for (int i = 0; i < s; i++) {
            System.out.print (" " + (array[i]*average));
        }
    }
}
