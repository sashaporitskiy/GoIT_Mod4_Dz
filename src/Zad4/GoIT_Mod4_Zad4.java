package Zad4;

import java.util.Scanner;

/**
 * Задание 4
 Написать функцию getMax которая принимает на вход два аргумента в виде чисел. А возвращает максимальное из этих двух.
 Также, необходимо перегрузить эту функцию для работы с разными числовыми типами переменных (int, float)
 */

public class GoIT_Mod4_Zad4 {
    public static void main(String[] args) {
        float fa = enterNumber();
        float fb = enterNumber();

        int ia = (int) fa;
        int ib = (int) fb;

        if ((fa%ia==0)&&(fb%ib==0))
            System.out.println(getMax( ia, ib));
            else System.out.println(getMax( fa, fb));
    }

    static float enterNumber(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter integer number - > ");
        float  a = scr.nextFloat();
        if (a==0){
            System.out.println("you entered a number zero, please enter a different integer number");
            a = scr.nextFloat();
        }
        return a;
    }

    static int getMax(int a, int b){
        System.out.println(" out max integer number ");
        return (a>b ? a:b);
    }

    static float getMax(float a, float b){
        System.out.println(" out max float number ");
        return (a>b ? a:b);
    }
}
