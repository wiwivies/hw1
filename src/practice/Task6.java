package practice;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество метров: ");
        double meters = scanner.nextDouble();

        System.out.println("Выберите вариант перевода:");
        System.out.println("1 - в мили");
        System.out.println("2 - в дюймы");
        System.out.println("3 - в ярды");

        int choice = scanner.nextInt();
        double result;

        switch (choice) {
            case 1:
                // Перевод метров в мили (1 миля = 1609.34 метра)
                result = meters / 1609.34;
                System.out.println(meters + " метров = " + result + " миль.");
                break;
            case 2:
                // Перевод метров в дюймы (1 метр = 39.37 дюймов)
                result = meters * 39.37;
                System.out.println(meters + " метров = " + result + " дюймов.");
                break;
            case 3:
                // Перевод метров в ярды (1 метр = 1.09361 ярда)
                result = meters * 1.09361;
                System.out.println(meters + " метров = " + result + " ярдов.");
                break;
            default:
                System.out.println("Ошибка: выберите корректный вариант перевода (1, 2 или 3).");
                break;
        }
    }
}
