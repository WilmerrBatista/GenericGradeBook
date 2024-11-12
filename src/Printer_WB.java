/* PROGRAM: Printer_WB.java
 Author: Wilmer Batista
 Purpose: A generic class to print any type of value.
 Date Created: 10/12/2024
 Last modified: 10/14/2024
*/

public class Printer_WB<T> {
    // Field to store a value of type T
    T printData;

    // Constructor to initialize the value of type T
    public Printer_WB(T printData) {
        this.printData = printData;
    }

    // Method to print the value
    public void print() {
        System.out.println(printData);
    }
}
