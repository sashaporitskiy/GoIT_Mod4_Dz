package Zad3;
/**
 * Задание 3
 Перегрузить функцию drawRectangle (задание 2) таким образом, чтобы она могла принимать на вход только 1 параметр (ширина квадрата) и рисовать квадрат с равными сторонами
 Например 2
 Вывод программы:
 + +
 + +
 Например 3
 Вывод программы:
 + + +
 + + +
 + + +
 */

import java.util.Scanner;

public class GoIT_Mod4_Zad3 {
    public static void main(String[] args) {
        int a= enterNumber();

        drawRectangle(a );
    }
    static void drawRectangle(int a ){
        drawRectangle(a,a );
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
    static void drawRectangle(int a,int b ){

        for (int i=0;i<b;i++){
            for (int j=0;j<a;j++){
                System.out.print("+ ");
            }
            System.out.println("\n ");
        }
    }
}
