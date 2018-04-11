import java.util.Scanner;

/**
 * Created by savion.levi on 4/9/2018.
 */


// classic bubble sort algorithm
public class BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(a, n);
    }

    public void bubbleSort(int[] a, int n) {
        int numberOfSwaps = 0;
        int firstElement = 0;
        int lastElement = 0;
        for (int i = 0; i < a.length; i++) {
            // Track number of elements swapped during a single array traversal


            for (int j = 0; j < a.length-1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swap(j, j + 1, a);
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
        firstElement=a[0];
        lastElement=a[n-1];
        System.out.println("First Element: "+firstElement);
        System.out.println("Last Element: "+lastElement);
    }

    public void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
