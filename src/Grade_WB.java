/* PROGRAM: Grade_WB.java
 Author: Wilmer Batista
 Purpose: A generic class to store and print grade values (numbers or letters).
 Date Created: 10/12/2024
 Last modified: 10/14/2024
*/

public class Grade_WB<T> {
    // Field to store the grade of type T
    T gradeValue;

    // Constructor to initialize the grade value
    public Grade_WB(T gradeValue) {
        this.gradeValue = gradeValue;
    }

    // Method to print the grade value or its ASCII code if it's a character
    public void printGrade() {
        if (gradeValue instanceof Character) {
            System.out.println((int) (Character) gradeValue); // Print ASCII code
        } else {
            System.out.println(gradeValue); // Print the grade value
        }
    }
}
