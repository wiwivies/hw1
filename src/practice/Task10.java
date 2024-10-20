package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20]; // Создаем массив размером 20 элементов

        // Заполняем массив случайными числами в диапазоне от -10 до 10
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10; // Генерация чисел от -10 до 10
        }

        // Создаем списки для хранения четных, нечетных, отрицательных и положительных чисел
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();
        List<Integer> positiveNumbers = new ArrayList<>();

        // Проходим по исходному массиву и распределяем числа по соответствующим спискам
        for (int num : array) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
            if (num < 0) {
                negativeNumbers.add(num);
            } else if (num > 0) {
                positiveNumbers.add(num);
            }
        }

        // Преобразуем списки в массивы для вывода
        int[] evenArray = evenNumbers.stream().mapToInt(Integer::intValue).toArray();
        int[] oddArray = oddNumbers.stream().mapToInt(Integer::intValue).toArray();
        int[] negativeArray = negativeNumbers.stream().mapToInt(Integer::intValue).toArray();
        int[] positiveArray = positiveNumbers.stream().mapToInt(Integer::intValue).toArray();

        // Вывод результатов
        System.out.println("Исходный массив: ");
        printArray(array);

        System.out.println("Массив четных чисел: ");
        printArray(evenArray);

        System.out.println("Массив нечетных чисел: ");
        printArray(oddArray);

        System.out.println("Массив отрицательных чисел: ");
        printArray(negativeArray);

        System.out.println("Массив положительных чисел: ");
        printArray(positiveArray);
    }

    // Метод для вывода массива
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}