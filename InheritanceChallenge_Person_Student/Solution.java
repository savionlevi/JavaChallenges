package sample.InheritanceChallenge;

import java.util.Scanner;

/**
 * Created by savion.levi on 4/4/2018.
 *
 * input:
 * read first name, last name, id number
 * read student (test) scores)
 *
 * output:
 * name, last name, id number, and grade in letter representation
 *
 */
 public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
