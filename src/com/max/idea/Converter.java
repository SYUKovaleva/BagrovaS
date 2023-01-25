package com.max.idea;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Выберите, что переводить: 1-масса, 2-расстояние ");
        int mr = in.nextInt();

        //Пользователь выбрал массу
        if (mr==1) {
            System.out.println("Выберите, единицу измерения: 1-тонна, 2-килограмм, 3-грамм, 4-миллиграмм ");
            int m = in.nextInt();
            //В тоннах
            if (m==1) {
                System.out.println("Введите число выбранных единиц ");
                double x = in.nextDouble();
                System.out.println("Результат:\nТонны: " + x + "\nКилограммы: " + (x*1000) + "\nГраммы: " + (x*1000000) + "\nМиллиграммы: " + (x*1000000000));
            }
            //В киллограммах
            else if (m==2) {
                System.out.println("Введите число выбранных единиц ");
                double x = in.nextDouble();
                System.out.println("Результат:\nТонны: " + (x/1000) + "\nКилограммы: " + x + "\nГраммы: " + (x*1000) + "\nМиллиграммы: " + (x*1000000));
            }
            //В граммах
            else if (m==3) {
                System.out.println("Введите число выбранных единиц ");
                double x = in.nextDouble();
                System.out.println("Результат:\nТонны: " + (x/1000000) + "\nКилограммы: " + (x/1000) + "\nГраммы: " + x + "\nМиллиграммы: " + (x*1000));
            }
            //В миллиграммах
            else if (m==4) {
                System.out.println("Введите число выбранных единиц ");
                double x = in.nextDouble();
                System.out.println("Результат:\nТонны: " + (x/1000000000) + "\nКилограммы: " + (x/1000000) + "\nГраммы: " + (x/1000) + "\nМиллиграммы: " + x);
            }
            //Ошибка
            else {System.out.println("Мы такого варианта не предлагали");}
        }

        //Пользователь выбрал расстояние
        else if (mr==2) {
            System.out.println("Выберите, единицу измерения: 1-километр, 2-метр, 3-сантиметр, 4-миллиметр ");
            int r = in.nextInt();

            //В километрах
            if (r==1) {
                System.out.println("Введите число выбранных единиц ");
                double x = in.nextDouble();
                System.out.println("Результат:\nКилометры: " + x + "\nМетры: " + (x*1000) + "\nСантиметры: " + (x*100000) + "\nМиллиметры: " + (x*1000000));
            }
            //В метрах
            else if (r==2) {
                System.out.println("Введите число выбранных единиц ");
                double x = in.nextDouble();
                System.out.println("Результат:\nКилометры: " + (x/1000) + "\nМетры: " + x + "\nСантиметры: " + (x*100) + "\nМиллиметры: " + (x*1000));
            }
            //В сантиметрах
            else if (r==3) {
                System.out.println("Введите число выбранных единиц ");
                double x = in.nextDouble();
                System.out.println("Результат:\nКилометры: " + (x/100000) + "\nМетры: " + (x/100) + "\nСантиметры: " + x + "\nМиллиметры: " + (x*10));
            }
            //В миллиметрах
            else if (r==4) {
                System.out.println("Введите число выбранных единиц ");
                double x = in.nextDouble();
                System.out.println("Результат:\nКилометры: " + (x/1000000) + "\nМетры: " + (x/1000) + "\nСантиметры: " + (x/10) + "\nМиллиметры: " + x);
            }

            //Ошибка
            else {System.out.println("Мы такого варианта не предлагали");}
        }

        //Ошибка
        else {
            System.out.println("Ваш выбор не ясен");}

    }
}
