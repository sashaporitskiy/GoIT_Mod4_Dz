package Zad6;

import java.util.Scanner;

/**
 *Решить задачу 2, без использования циклов. Используя рекурсию.
 *
 * Задание 2
 Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+'
 Аргументы функции: ширина прямоугольника в символах, высота прямоугольника в символах

 Например 3 на 2
 Вывод программы:
 + + +
 + + +

 */
public class GoIT_Mod4_Zad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number - >  ");
        int a = sc.nextInt();
        System.out.println("Enter integer number - >  ");
        int b = sc.nextInt();
        System.out.println("Result:");
        drawRectangle(a,a,b);
    }

    static void drawRectangle(int ta, int a, int b) {
        if (ta > 0) {
            System.out.print("+ ");
            drawRectangle(ta - 1, a, b);
        }
        else if ((ta == 0) && (b > 1)) {
            System.out.println("");
            drawRectangle(a, a, b - 1);
        }
    }
}
