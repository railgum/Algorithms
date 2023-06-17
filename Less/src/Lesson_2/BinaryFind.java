package Lesson_2;

public class BinaryFind {
    public static int binaryFind(int[] array, int value, int min, int max){
        int midpoint;
        if (max < min) {
            return -1;
        }else {
            midpoint = (max - min) / 2 + min;
        }
        if (array[midpoint] < value){
            return binaryFind(array, value, midpoint + 1, max);
        } else {
            if (array[midpoint] > value) {
                return binaryFind(array, value, min, midpoint-1);
            } else {
                return midpoint;
            }
        }
    }
}
