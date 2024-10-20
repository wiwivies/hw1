package practice;

public class Task11 {
    // Метод для отображения горизонтальной или вертикальной линии
    public static void drawLine(int length, char direction, char symbol) {
        if (direction == 'h') { // Горизонтальная линия
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
            System.out.println(); // Переход на новую строку
        } else if (direction == 'v') { // Вертикальная линия
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Ошибка: Неверное направление. Используйте 'h' для горизонтальной линии или 'v' для вертикальной.");
        }
    }

    public static void main(String[] args) {
        // Тест метода
        drawLine(5, 'h', '*'); // Горизонтальная линия из 5 символов '*'
        drawLine(4, 'v', '#'); // Вертикальная линия из 4 символов '#'
    }
}
