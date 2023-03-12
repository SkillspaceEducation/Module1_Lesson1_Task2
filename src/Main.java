/*
Написать метод, который принимает на вход два целых числа, делает их
суммирование и складывает результат с произведением двух этих чисел, и
возвращает полученный результат из метода.

Передать на вход в метод любые два числа.
Вывести полученный результат работы метода на экран.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите два целых числа через пробел: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        //scanner.close();
        int result = statetement(number1,number2);
        System.out.printf("Результат операции:\n(%d + %d) + %d * %d = %d", number1, number2, number1, number2, result);
    }
    static int statetement(int i1, int i2){
        int statetement = (i1 + i2) + i1 * i2;
        return statetement;
    }
}