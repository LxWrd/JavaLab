package lab1.exercise1;

import java.util.Scanner;

public class task_fifth {
    static void main(String[] args) {
        int number = get_number();
        boolean result = is2Digits(number);
        System.out.println(result);

    }
    private static boolean is2Digits(int x) {
        int tens = x / 10;
        if (tens >= 1 && tens <= 9){
            return true;
        }
        else return false;
    }
    private static int get_number() {
        // Обработка исключений при ошибке рекурсивно запускает этот же метод
        System.out.print("Введите цифру либо число, чтобы узнать двузначное ли оно : ");
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
