package marko_manev;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {6, 2, 4, 9, 3, 1, 7};
        
        System.out.println("Ursprüngliches Array:");
        printArray(array);

        System.out.println("Sortiertes Array:");        
        bubbleSort(array);
        printArray(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            
            //System.out.println("Array nach Durchlauf " + (i + 1) + ":");
            //printArray(array);
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
 