package practice;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        double number = scanner.nextDouble();

        System.out.print("Введите процент: ");
        double percent = scanner.nextDouble();

        double result = number * percent / 100;

        System.out.println(percent + "% от " + number + " равно " + result);
    }
}
