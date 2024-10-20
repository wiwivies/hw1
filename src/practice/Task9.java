package practice;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20]; // Создаем массив размером 20 элементов

        // Заполняем массив случайными числами в диапазоне от -10 до 10
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10; // Генерация чисел от -10 до 10
        }

        int min = array[0];
        int max = array[0];
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        // Анализ массива
        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        // Вывод результатов
        System.out.println("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nМинимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Количество отрицательных элементов: " + negativeCount);
        System.out.println("Количество положительных элементов: " + positiveCount);
        System.out.println("Количество нулей: " + zeroCount);
    }
}
