package practice;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите шестизначное число: ");
        String input = scanner.nextLine();

        if (input.length() == 6 && input.matches("\\d+")) {
            // Меняем первую и шестую, вторую и пятую цифры местами
            String result = input.charAt(5) +
                    input.substring(4, 5) +
                    input.substring(2, 4) +
                    input.substring(1, 2) +
                    input.charAt(0);

            System.out.println("Результат: " + result);
        } else {
            System.out.println("Ошибка: Введите корректное шестизначное число.");
        }
    }
}
