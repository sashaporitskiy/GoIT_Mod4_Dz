package Zad5;

import java.util.Scanner;

/**
 * Задание 1
 Написать функцию которая считает в консоли до числа Х.
 Аргументы функции: число Х

 Например Х = 5.
 Вывод программы:

 Задание 5
 Решить задачу 1, без использования циклов. Используя рекурсию
 */

public class GoIT_Mod4_Zad5 {
    public static void main(String[] args) {
        int a= enterNumber();
        int b= 1;
        outNumber(a,b);
    }
    public static int enterNumber(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter integer number - > ");
        int a = scr.nextInt();
        if (a==0){
            System.out.println("you entered a number zero, please enter a different integer number");
            a = scr.nextInt();
        }
        return a;
    }
    static void outNumber(int a,int b ){

        if (b <= a) {
            System.out.println(b++);
            outNumber(a,b);
        }
    }
}
