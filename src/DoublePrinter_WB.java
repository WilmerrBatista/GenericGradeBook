/* PROGRAM: DoublePrinter_WB.java
 Author: Wilmer Batista
 Purpose: A class that prints a Double value.
 Date Created: 10/12/2024
 Last modified: 10/14/2024
*/

public class DoublePrinter_WB {
    // Field to store a Double value
    Double printData;

    // Constructor to initialize the Double value
    public DoublePrinter_WB(Double printData) {
        this.printData = printData;
    }

    // Method to print the Double value
    public void print() {
        System.out.println(printData);
    }
}
