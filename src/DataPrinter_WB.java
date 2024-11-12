/* PROGRAM: DataPrinter_WB.java
 Author: Wilmer Batista
 Purpose: A class to demonstrate printing Integer, Double, and String values.
 Date Created: 10/12/2024
 Last modified: 10/14/2024
*/

public class DataPrinter_WB {
    public static void main(String[] args) {
        // Create and print an Integer value
        IntegerPrinter_WB integerPrinter = new IntegerPrinter_WB(209);
        integerPrinter.print(); // Output: 209

        // Create and print a Double value
        DoublePrinter_WB doublePrinter = new DoublePrinter_WB(98.7);
        doublePrinter.print(); // Output: 98.7

        // Create and print a String value
        StringPrinter_WB stringPrinter = new StringPrinter_WB("A String");
        stringPrinter.print(); // Output: A String
    }
}
