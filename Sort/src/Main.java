import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import Lesson_2.*;
import HomeWork_2.*;
import Sem_3.*;
import Lesson_4.*;
public class Main {
    public static void main(String[] args) {
//        int[] array = randomFill(6);
//        print(array);
//        BubbleSort.bubbleSort(array);
//        HeapSort.sort(array);
//        print(array);
     /*   LinkedListSem list = new LinkedListSem();
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(1);
        list.print();
        list.removeAt(2);
        list.print();*/
        final RedBlackTree tree = new RedBlackTree();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
           while (true){
               try {
                   int value = Integer.parseInt(reader.readLine());
                   tree.add(value);
                   System.out.println("finish");
               } catch (Exception ignored){

               }
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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