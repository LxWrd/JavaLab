package lab1.exercise4;

public class task_third {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 2, -5};
        int x = 4;
        int index = maxAbs(arr, x);
        System.out.println("Индекс первого вхождения: " + index);
    }

    public static int maxAbs(int[] arr, int x) {
        // Линейный поиск максимального числа по модулю
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (abs(arr[i]) > max) {
                max = abs(arr[i]);
            }

        }
        return max; // Вывод максимального числа по модулю
    }
    public static int abs ( int num){
//        Условие для модуля, если отрицательно то домножить на -1, иначе оставить
        if (num < 0) {
            return num * -1;
        }
        return num;
    }
}