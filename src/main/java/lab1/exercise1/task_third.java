package lab1.exercise1;
import java.util.Scanner;

public class task_third {
    static void main(String[] args) {
        char char1 = get_char();
        int result = charToNum(char1);
        System.out.println("Ответ: " + result);
    }

    public static int charToNum(char x) {
//        Перевод из char в int
        return x - 48;
    }

    private static char get_char() {
//        Обработка искючений при ошибке рекурсивно запускает этот же метод
        System.out.print("Введите цифру чтобы получить: ");
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        if (string.length() == 1) {
            try {
                char char0 = string.charAt(0);
                if (char0 >= '0' && char0 <= '9') {
                    return char0;
                } else System.out.println("Ошибка ввода");
                return get_char();
            } catch (Exception e) {
                System.out.println("Ошибка ввода");
                return get_char();
            }
        } else System.out.println("Ошибка ввода");
        return get_char();
    }
}