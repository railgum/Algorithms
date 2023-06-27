import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import Lesson_2.*;
import HomeWork_2.*;
import Sem_3.*;
import Lesson_4.*;
import Sem_4.*;
public class Main {
    public static void main(String[] args) {
//        int[] array = randomFill(6);
//        print(array);
//        BubbleSort.bubbleSort(array);
//        HeapSort.sort(array);
//        print(array);
<<<<<<< HEAD
     /*   LinkedListSem list = new LinkedListSem();
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(1);
        list.print();
        list.removeAt(2);
        list.print();*/
        /*final RedBlackTree tree = new RedBlackTree();
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
        }*/

        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(6);
        tree.add(3);
        tree.add(4);
        tree.add(8);
        tree.add(5);
        tree.add(2);
        tree.add(15);
=======
        LinkedListSem list = randomFillList(15);
        list.print();
        list.revert();
        list.print();
>>>>>>> homework_3

        tree.print();
    }

    private static int[] randomFill(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Random().nextInt(10);
        }
        return array;
    }
    private static LinkedListSem randomFillList(int lotNodes){
        LinkedListSem list = new LinkedListSem();
        for (int i = 0; i < lotNodes; i++) {
            list.add(new Random().nextInt(10));
        }
        return list;
    }
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}