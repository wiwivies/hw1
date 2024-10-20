package practice;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task12 {
    // Метод для сортировки массива
    public static void sortArray(int[] array, boolean ascending) {
        if (ascending) {
            Arrays.sort(array); // Сортировка по возрастанию
        } else {
            Arrays.sort(array); // Сортировка по возрастанию, затем реверсируем
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        // Проверка ввода длины массива
        while (true) {
            try {
                System.out.println("Введите длину массива (положительное число):");
                n = scanner.nextInt();
                if (n > 0) {
                    break; // Ввод корректный, выходим из цикла
                } else {
                    System.out.println("Ошибка: длина массива должна быть положительным числом.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите корректное целое число.");
                scanner.next(); // Очищаем неправильный ввод
            }
        }

        int[] array = new int[n];

        // Ввод элементов массива с проверкой
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.printf("Элемент %d: ", i + 1);
                    array[i] = scanner.nextInt();
                    break; // Ввод корректный
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введите корректное целое число.");
                    scanner.next(); // Очищаем неправильный ввод
                }
            }
        }

        // Проверка выбора типа сортировки
        boolean ascending = true;
        while (true) {
            try {
                System.out.println("Выберите сортировку (1 для возрастания, 0 для убывания):");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    ascending = true;
                    break;
                } else if (choice == 0) {
                    ascending = false;
                    break;
                } else {
                    System.out.println("Ошибка: введите 1 для возрастания или 0 для убывания.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите корректное число (1 или 0).");
                scanner.next(); // Очищаем неправильный ввод
            }
        }

        // Сортировка и вывод результата
        sortArray(array, ascending);

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
    }
}