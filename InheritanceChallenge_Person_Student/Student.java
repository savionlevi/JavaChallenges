package sample.InheritanceChallenge;

/**
 * Created by savion.levi on 4/4/2018.
 */
public class Student extends Person{
    private int[] testScores;


    /*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */


    public Student(String firstName, String lastName, int identification, int[] scores){
        super(firstName,lastName,identification);
        this.testScores = scores;
    }

    public char calculate(){
        int average=0;
        for(int i=0; i<this.testScores.length ; i++) {
            average = average + testScores[i];
        }
        average = average / testScores.length;
        char gradeLetter = converteNumberToLetterGrade(average);

        return gradeLetter;
    }

    /*
 *   Method Name: calculate
 *   @return A character denoting the grade.
 */


    public char converteNumberToLetterGrade(int average){
        char gradeLetter='a';

        if(average < 40){
            gradeLetter =  'T';
        }

        if((average >= 40) && (average < 50)) {
            gradeLetter = 'D';
        }

        if((average >= 55) && (average < 70)) {
            gradeLetter = 'P';
        }

        if((average >= 70) && (average < 80)) {
            gradeLetter = 'A';
        }

        if((average >= 80) && (average < 90)) {
            gradeLetter = 'E';
        }

        if((average >= 90) && (average <= 100)) {
            gradeLetter = 'O';
        }
        return gradeLetter;
    }
}
