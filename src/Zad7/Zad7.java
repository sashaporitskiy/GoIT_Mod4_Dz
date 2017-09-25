package Zad7;

import Zad1.GoIT_Mod4_Zad1;
import Zad2.GoIT_Mod4_Zad2;
import Zad3.GoIT_Mod4_Zad3;
import Zad4.GoIT_Mod4_Zad4;
import Zad5.GoIT_Mod4_Zad5;
import Zad6.GoIT_Mod4_Zad6;

import java.util.Scanner;

/**
 * Задание 7 (дополнительно)
 Написать программу, в которой выполнены все шесть предыдущих заданий. Каждое задание выполняется в отдельной функции. В пределах этой же функции происходит ввод с консоли необходимых данных.
 Программа спрашивает у пользователя какую задачу он хочет решить (от 1 до 6).
 Затем программа вызывает соответствующую функцию для решения этой задачи.
 По окончанию решения задачи, программа спрашивает пользователя, хочет ли он продолжить решать задачи. Если да - опять спрашивает какую задачу

 */
public class Zad7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Возможные варианты: \n" +
                        "  1 - функция которая считает в консоли до числа Х.\n" +
                        "  2 - Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+';\n" +
                        "  3 - Перегрузить функцию drawRectangle (задание 2) таким образом, чтобы она могла принимать на вход только 1 параметр (ширина квадрата) и рисовать квадрат с равными сторонами\n" +

                        "  4 - Написать функцию getMax которая принимает на вход два аргумента в виде чисел. А возвращает максимальное из этих двух.;\n" +
                        "  5 - Решить задачу 1, без использования циклов. Используя рекурсию;\n" +
                        "  6 - Решить задачу 2, без использования циклов. Используя рекурсию.\n"
        );

        String reply;

        do {
            System.out.println("введите число  (от 1 до 6): ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    GoIT_Mod4_Zad1.main(args);
                    break;
                case 2:
                    GoIT_Mod4_Zad2.main(args);
                    break;
                case 3:
                    GoIT_Mod4_Zad3.main(args);
                    break;
                case 4:
                    GoIT_Mod4_Zad4.main(args);
                    break;
                case 5:
                    GoIT_Mod4_Zad5.main(args);
                    break;
                case 6:
                    GoIT_Mod4_Zad6.main(args);
            }
            System.out.println("\n Вы хотите попробовать еще раз? (Y/N) ");
            sc.nextLine();
            reply = sc.nextLine();
        } while (reply.equals("Y"));
    }
}