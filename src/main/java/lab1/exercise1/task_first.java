package lab1.exercise1;
import java.util.Scanner;

public class task_first {
    static void main(String[] args) {
        double number = get_number();
        double result = fraction(number);
        System.out.println("Дробная часть числа равна: " + result);
    }

    private static double fraction(double x) {
        // Получаем целую часть числа
        int intNum = (int) x;
        return x - intNum;
    }

    private static double get_number() {
        // Обработка исключений при ошибке рекурсивно запускает этот же метод
        System.out.print("Введите число чтоб узнать его дробную часть: ");
        Scanner scan = new Scanner(System.in);
        scan.close();
        try {
            double number = scan.nextDouble();
            return number;
        } catch (Exception e) {
            System.out.println("Ошибка ввода");
            return get_number();
        }
    }
}