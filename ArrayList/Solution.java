import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static String firstWholeString;
    public static String secondWholeString;
    public static char[] evenIndexed;
    public static char[] oddIndexed;
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        Solution sol = new Solution();
        int T = reader.nextInt();
        ArrayList<String> allStrings = new ArrayList<>();
        String input;
        for (int counter = 0; counter < T; counter++) {
            input = reader.next();
            allStrings.add(input);
        }

        for (String s : allStrings) {
            evenIndexed = getStringReturnArray(s);
            oddIndexed = getStringReturnArray(s);
            printEven(evenIndexed);
            System.out.print(" ");
            printOdd(oddIndexed);
            System.out.println(" ");

        }

    }


    public static char[] getStringReturnArray(String stringToArray) {

        char[] array = stringToArray.toCharArray();
        return array;
    }

    public  static void printEven(char[] s) {
        for (int i = 0; i < s.length; i++) {
            if ((i % 2) == 0) System.out.print(s[i]);
        }
    }

    public static void printOdd(char[] s) {

        for (int i = 0; i < s.length; i++) {
            if ((i % 2) != 0) System.out.print(s[i]);
        }
    }
}