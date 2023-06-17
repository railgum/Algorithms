package Sem_2;

public class BubbleSort {
    public static void bubleSort(int[] array){
        int count = 0;
        int length = array.length - 1;
        boolean isSorted = false;
        for (int i = 0; i < array.length - 1 && !isSorted; i++) {
            isSorted = true;
            for (int j = 0; j < length; j++) {
                count++;
                if (array[j] > array[j+1]) {
                    isSorted = false;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            length--;
        }
        System.out.println(count);
    }
}
