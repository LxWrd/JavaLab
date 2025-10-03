package lab1.exercise2;

import java.util.Scanner;

public class task_fifth {
    static void main(String[] args) {
        int a = get_number("первое");
        int b = get_number("второе");
        int num = get_number("третье");
        int result = max3(a,b,num);
        System.out.println(result);
    }
    public static int max3(int a,int b,int c) {
//        double max = Double.NEGATIVE_INFINITY;
        int max = b;
        if (a >= b) {
            max = a;
        }
        if (c >= max) {
            max = c;
        }
        return max;
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
