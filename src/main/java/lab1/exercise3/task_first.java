package lab1.exercise3;

import java.util.Scanner;

public class task_first {
    static void main(String[] args){
        int num = get_number();
        String string = listNums(num);
    }
    public static String listNums (int x) {
//        Цикл с шагом 1
        for (int i = 0; i <= x;i++){
            System.out.print(i+" ");
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
