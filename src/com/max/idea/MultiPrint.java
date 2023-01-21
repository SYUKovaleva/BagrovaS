package com.max.idea;
import java.sql.SQLOutput;
import java.util.Scanner;
public class MultiPrint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи возраст: ");
        int age = in.nextInt();
        System.out.println("Введи имя: ");
        String name = in.next();
        System.out.println("Введи рост (m.): ");
        float height = in.nextFloat();
        System.out.printf("Имя: %s Возраст: %d Рост: %.2f", name, age, height);
    }
}
