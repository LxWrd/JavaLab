package lab1.exercise2;

import java.util.Scanner;

public class task_third {
    static void main (String[] args) {
        int number = get_number();
        boolean result = is35(number);
        System.out.println(result);
    }
    public static boolean is35(int number) {
//        XOR
        if (number % 5 == 0 ^ number % 3 == 0) {
            return true;
        }
        return false;
    }
    private static int get_number() {
        // Обработка исключений при ошибке рекурсивно запускает этот же метод
        System.out.print("Введите числo которое нужно проверить на is35: ");
        Scanner scan = new Scanner(System.in);
        try {
            int number = scan.nextInt();
            return number;
        } catch (Exception e) {
            System.out.println("Ошибка ввода");
            return get_number();
        }
    }
}
