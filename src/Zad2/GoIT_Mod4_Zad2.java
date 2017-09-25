package Zad2;
import java.util.Scanner;
/**
 * Задание 2
 Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+'
 Аргументы функции: ширина прямоугольника в символах, высота прямоугольника в символах
 Например 3 на 2
 Вывод программы:
 + + +
 + + +
 */
public class GoIT_Mod4_Zad2 {
    public static void main(String[] args) {
        int a= enterNumber();
        int b= enterNumber();
        drawRectangle(a,b );
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
