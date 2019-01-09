package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Numbers firstNumbers = new Numbers();
        firstNumbers.calc(14, 17);
        firstNumbers.calc(2.5,3.7);
        firstNumbers.multiply(14, 17);
        firstNumbers.multiply(2.5, 3.7);
        firstNumbers.divide(14.3, 3);
        firstNumbers.divide(20, 2);
        firstNumbers.average(14.5, 17);
        firstNumbers.average(14, 17);
    }
}
