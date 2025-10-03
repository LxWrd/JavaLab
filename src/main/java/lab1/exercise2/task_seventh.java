package lab1.exercise2;

import java.util.Scanner;

public class task_seventh {
    static void main(String[] args) {
        int a = get_number("первое");
        int b = get_number("второе");
        int result = sum2(a,b);
        System.out.println(result);
    }
    public static int sum2(int a,int b) {
        int sum = a + b;
        if (10 <= sum && 19 >= sum) {
            return 20;
        }
        return sum;
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
