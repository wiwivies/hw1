package practice;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        // Нормализация границ
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        System.out.println("Нечетные числа в диапазоне от " + start + " до " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
