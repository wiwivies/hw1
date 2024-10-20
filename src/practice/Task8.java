package practice;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число диапазона: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число диапазона: ");
        int num2 = scanner.nextInt();

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        for (int i = start; i <= end; i++) {
            System.out.println("Таблица умножения для " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println(); // Пустая строка для разделения таблиц
        }
    }
}