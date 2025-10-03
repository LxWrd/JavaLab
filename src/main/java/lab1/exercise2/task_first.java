package lab1.exercise2;

import java.util.Scanner;

public class task_first {
    void main(String[] args) {
        int number = get_number();
        int result = abs(number);
        System.out.println(result);
    }

    public static int abs(int num) {
//        Условие для модуля, если отрицательно то домножить на -1, иначе оставить
        if (num < 0) {
            return num * -1;
        }
        return num;
    }

    private static int get_number() {
        // Обработка исключений при ошибке рекурсивно запускает этот же метод
        System.out.print("Введите число которое нужно представить в модуле: ");
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
