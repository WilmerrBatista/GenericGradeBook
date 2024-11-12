/* PROGRAM: GradeExample_WB.java
 Author: Wilmer Batista
 Purpose: A class to demonstrate the use of the Grade class with both letter and score grades.
 Date Created: 10/12/2024
 Last modified: 10/14/2024
*/

public class GradeExample_WB {
    public static void main(String[] args) {
        // Create and print a numeric grade
        Grade_WB<Double> gradeScore = new Grade_WB<>(89.7);
        gradeScore.printGrade(); // Output: 89.7

        // Create and print a letter grade (ASCII code will be printed)
        Grade_WB<Character> gradeLetter = new Grade_WB<>('C');
        gradeLetter.printGrade(); // Output: 67 (ASCII code for 'C')
    }
}
