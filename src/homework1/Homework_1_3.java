package homework1;

public class Homework_1_3 {
    public static void main(String[] args) {
        //В переменной n хранится трёхзначное число. Создайте программу,
        //вычисляющую и выводящую на экран сумму цифр n. Например: n = 126, в
        //результате мы должны получить 9 (1+2+6).
        int n = 126;
        int a = n / 100;
        int b = (n % 100) / 10;
        int c = n % 10;
        int d = a + b + c;
        System.out.println(d + " (" + a + " + " + b + " + " + c + ")");
    }
}
