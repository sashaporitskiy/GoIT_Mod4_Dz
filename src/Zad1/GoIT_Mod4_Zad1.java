package Zad1;
import java.util.Scanner;
/**
 * Задание 1
 Написать функцию которая считает в консоли до числа Х.
 Аргументы функции: число Х
 Например Х = 5.
 Вывод программы:
 1
 2
 3
 4
 5
 */
public class GoIT_Mod4_Zad1 {
    public static void main(String[] args) {
        int x= enterNumber();
        outNumber(x );
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
    static void outNumber(int x ){

        for (int i=0;i<=x;i++){
            System.out.println(i);
        }
    }
}
