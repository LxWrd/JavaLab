package lab1.exercise2;

import java.util.Scanner;

public class task_ninth {
    static void main (String[] args) {
        int number = get_number();
        String result = day(number);
        System.out.println(result);
    }
    public static String day(int number) {
        String string = "nothing";
        switch (number) {
            case 1:
                string = "Понедельник";
                break;
            case 2:
                string = "Вторник";
                break;
            case 3:
                string = "Среда";
                break;
            case 4:
                string = "Четверг";
                break;
            case 5:
                string = "Пятница";
                break;
            case 6:
                string = "Суббота";
                break;
            case 7:
                string = "Воскресение";
                break;
            default:
                string = "Это не день недели";

        }
        return string;
    }
    private static int get_number() {
        // Обработка исключений при ошибке рекурсивно запускает этот же метод
        System.out.print("Введите числo обозначающий день недели: ");
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
