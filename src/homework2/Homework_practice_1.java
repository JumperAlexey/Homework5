package homework2;

import java.util.Scanner;

public class Homework_practice_1 {

/*
Задача 1:
Ввести с консоли любое число от 1 до 12. В зависимости от введённого числа
вывести в консоль соответствующую пору года по номеру месяца. При решении
использовать switch.
 */

    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 12");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("я хз");
        }
    }
}
