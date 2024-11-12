/* PROGRAM: StringPrinter_WB.java
 Author: Wilmer Batista
 Purpose: A class that prints a String value.
 Date Created: 10/12/2024
 Last modified: 10/14/2024
*/

public class StringPrinter_WB {
    // Field to store a String value
    String printData;

    // Constructor to initialize the String value
    public StringPrinter_WB(String printData) {
        this.printData = printData;
    }

    // Method to print the String value
    public void print() {
        System.out.println(printData);
    }
}
