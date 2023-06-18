package Lesson_2;

public class InsertSort {
    public static void insertSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int num:array) {
            System.out.print(num + " ");
        }
    }
}
