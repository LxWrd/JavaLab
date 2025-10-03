package lab1.exercise4;

public class task_seventh {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 2, -5};
        int[] result = revers(arr);
        System.out.print("Результат: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static int[] revers(int[] arr) {
        int[] arr1 = new int[arr.length];
        // Заполняем arr1 в обратном порядке
        for (int i = arr.length - 1; i >= 0; i--) {
            arr1[arr.length - 1 - i] = arr[i];
        }

        return arr1;
    }
}