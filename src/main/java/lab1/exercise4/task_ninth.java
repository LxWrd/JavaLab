package lab1.exercise4;

public class task_ninth {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,6,6,8,2};
        int x = 2;
        int[] result = findAll(arr, x);
        System.out.print("Результат: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] findAll (int[] arr, int x) {
        int count = 0;
        for (int j = 0; j < arr.length; j++){
            if (arr[j] == x) {
                count++;
            };
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index] = i;
                index++;
            }
        }
        return result; // Если число не найдено, возвращаем -1
    }
}