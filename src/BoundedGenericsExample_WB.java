/* PROGRAM: BoundedGenericsExample_WB.java
 Author: Wilmer Batista
 Purpose: A class to demonstrate using the BoundedPrinter with Number types.
 Date Created: 10/12/2024
 Last modified: 10/14/2024
*/

// BoundedGenericsExample.java
public class BoundedGenericsExample_WB {
    public static void main(String[] args) {
        BoundedPrinter_WB<Integer> integerPrinter = new BoundedPrinter_WB<>(209);
        integerPrinter.print(); // Output: 209

        BoundedPrinter_WB<Double> doublePrinter = new BoundedPrinter_WB<>(98.7);
        doublePrinter.print(); // Output: 98.7

        // This line will cause a compile-time error because String doesn't extend Number
        // BoundedPrinter<String> stringPrinter = new BoundedPrinter<>("A String"); 
        // stringPrinter.print(); 
    }
}
