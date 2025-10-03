package lab1.exercise1;

import java.util.Scanner;

public class task_ninth {
    static void main(String[] args) {
        int a = get_number("первое");
        int b = get_number("второе");
        int num = get_number("третье");
        boolean result = isEqual(a,b,num);
        System.out.println(result);
    }

    public static boolean isEqual (int a, int b, int num) {
//        Проверка ровняются ли числа
        if (a == num && b == num) {
            return true;
        }
        return false;
    }
    private static int get_number(String words) {
        // Обработка исключений при ошибке рекурсивно запускает этот же метод
        System.out.print("Введите "+ words +" число: ");
        Scanner scan = new Scanner(System.in);
        try {
            int number = scan.nextInt();
            return number;
        } catch (Exception e) {
            System.out.println("Ошибка ввода");
            return get_number(words);
        }
    }
}


