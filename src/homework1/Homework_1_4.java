package homework1;

public class Homework_1_4 {
    /*
    В переменной n хранится вещественное число с ненулевой дробной частью.
    Создайте программу, которая округляет число n до ближайшего целого и
    выводящую результат на экран.
    */

    public static void main(String[] args) {
        double a = 0.75;
        int b = (int) Math.round(a);
        System.out.println(b);
    }
}
