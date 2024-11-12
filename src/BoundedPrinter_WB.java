/* PROGRAM: FileName_XX.java
Author: Wilmer Batista 
Purpose: The purpose of this program  is to teach how to use generics in Java to 
create flexible code that can handle different data types.
Date Created: 10/12/2024
Last modified: 10/14/2024
*/







// A generic class to store and print data of type Number or its subclasses
public class BoundedPrinter_WB<T extends Number> {
    // Field to hold the Number value
    T printData;

    // Constructor to initialize printData
    public BoundedPrinter_WB(T printData) {
        this.printData = printData;
    }

    // Method to print the stored Number value
    public void print() {
        System.out.println(printData);
    }
}
