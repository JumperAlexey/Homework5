package homework2;

import java.util.Scanner;

public class Homework_2_5 {

/*
Задача *:
Напишите программу, где пользователь вводит любое целое положительное
число. А программа суммирует все числа от 1 до введенного пользователем числа. Для
ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
пользователь не мог ввести некорректные данные.
 */

    public static void main(String[] args) {
        System.out.println("Введите положительное целое число");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        boolean b = scanner.hasNextInt();
        int a = scanner.nextInt();
        if (a > 0) {
            for (int i = 0; i <= a; i++){
                a = a + i;
                System.out.println(a);
                i++;
            }
        } else {
            System.out.println("Error");
        }
    }
}
