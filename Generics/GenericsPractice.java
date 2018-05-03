package Generics;

/**
 * Created by savion.levi on 5/3/2018.
 */
public class GenericsPractice {



    public static <E> void printArray(E[] array) {
        for(E element : array) {
            System.out.println(element+ " ");
        }
    }


    public static <T extends  Comparable <T>> T findMax (T a , T b) {
        int n = a.compareTo(b);
        if (n < 0) {
           return b;
        }
        else {
            return a;
        }
    }

    public static void main(String[] args) {
        Integer[] myIntArray = {1,2,3};
        String[] myStringArray = {"Apple", "Banana"};

        printArray(myIntArray);
        printArray(myStringArray);


        System.out.println(findMax(2,3));
        System.out.println(findMax(2.5,3.5));

    }
}
