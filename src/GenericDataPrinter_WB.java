/* PROGRAM: GenericDataPrinter_WB.java
 Author: Wilmer Batista
 Purpose: A class to demonstrate printing using the generic Printer class with different data types.
 Date Created: 10/12/2024
 Last modified: 10/14/2024
*/

public class GenericDataPrinter_WB {
    public static void main(String[] args) {
        Printer_WB<Integer> integerPrinter = new Printer_WB<>(100);
        integerPrinter.print(); // Output: 100

        Printer_WB<Double> doublePrinter = new Printer_WB<>(4543.987);
        doublePrinter.print(); // Output: 4543.987

        Printer_WB<String> stringPrinter = new Printer_WB<>("Another String");
        stringPrinter.print(); // Output: Another String
    }
}