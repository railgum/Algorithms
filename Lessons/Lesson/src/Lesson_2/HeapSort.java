package Lesson_2;

public class HeapSort {
     public static void sort(int[] array){
//          Построение кучи (перегруппировка массива)
          for (int i = array.length -1; i >= 0; i--) {
               heapSort(array, array.length, i);
          }
//          Один за
     }
     public static void heapSort(int[] array, int heapSize, int rootIndex){
         int largest = rootIndex; // инициализируем наибольший элемент как корень
         int leftChild = 2 * rootIndex +1; // левый = 2 * rootIndex + 1
         int rightChild = 2 * rootIndex + 2; // правый = 2 * rootIndex + 2

//           Если левый дочерний элемент больше корня
          if (rightChild < heapSize && array[rightChild] > array[largest]){
               largest = rightChild;
          }
//           Если самый большой элемент не корень
          if (largest != rootIndex) {
               int temp = array[rootIndex];
               array[rootIndex] = array[largest];
               array[largest] = temp;
          }
//          Рекурсивно преобразуем в двоичную кучу затронутое поддерево
          heapSort(array,heapSize,largest);
     }
}
