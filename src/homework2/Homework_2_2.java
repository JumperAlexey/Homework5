package homework2;

import java.util.Scanner;

public class Homework_2_2 {

/*
Задача 2:
Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
Если –5>= t >–20, то вывести «Normal». Если –20>= t, то вывести «Cold».
 */

    public static void main(String[] args) {
        System.out.println("Temper:");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if (t>-5) {
            System.out.println("Warm");
        } if (-5 >= t) {
            if (t > -20) {
            System.out.println("Normal");
        } } if (-20 >= t) {
            System.out.println("Cold");
        }

    }
}
