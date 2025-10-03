package lab1.exercise3;

import java.util.Scanner;

public class task_seventh {
    static void main(String[] args){
        int num = get_number();
        String string = listNums(num);
    }
    public static String listNums (int x) {
        for (int i = 0; i < x;i++){
            for (int j = 0; j < x;j++){
                System.out.print('*');
            }
            System.out.print("\n");
        }
        return "well";
    }
    private static int get_number() {
        // Обработка исключений при ошибке рекурсивно запускает этот же метод
        System.out.print("Введите число до которого будет идти цикл: ");
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
