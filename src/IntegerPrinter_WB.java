/* PROGRAM: IntegerPrinter_WB.java
 Author: Wilmer Batista
 Purpose: A class that prints an Integer value.
 Date Created: 10/12/2024
 Last modified: 10/14/2024
*/

public class IntegerPrinter_WB {
    // Field to store an Integer value
    Integer printData;

    // Constructor to initialize the Integer value
    public IntegerPrinter_WB(Integer printData) {
        this.printData = printData;
    }

    // Method to print the Integer value
    public void print() {
        System.out.println(printData);
    }
}
