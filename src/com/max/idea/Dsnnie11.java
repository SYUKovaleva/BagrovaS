package com.max.idea;

import java.util.Scanner;

public class Dsnnie11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        String a = input.nextLine();

        System.out.println("Введите второе число: ");
        int b = input.nextInt();

        // Вычислим бОльшее число int
        int c = Integer.parseInt(a);
        int resultMax = Math.max(b, c);
        System.out.println("Большее число: " + resultMax);

        // Вычислим меньшее число double
        double d = Double.parseDouble(a);
        double g = b;
        double resultMin = Math.min(d, g);
        System.out.println("Меньшее число: " + resultMin);
    }
}
