import java.util.Random;
import Lesson_2.*;

public class Main {
    public static void main(String[] args) {
        int[] array = randomFill(6);
        print(array);
        BubbleSort.bubleSort(array);
        print(array);
    }

    private static int[] randomFill(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Random().nextInt(10);
        }
        return array;
    }
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}