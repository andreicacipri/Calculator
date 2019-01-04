package org.fasttrackit;

public class Numbers {


    public double calc (double first, double second) {
        double sum = first + second;
        System.out.println("Sum is equal with  " + sum);
        return sum;
    }
    public double multiply (double first, double second) {
        double multi = first * second;
        System.out.println("Multiply is equal with " + multi);
        return multi;
    }
    public double divide (double first, double second) {
        double div = first/second;
        System.out.println("Divide is equal with " + div);
        return div;
    }
    public double average (double first, double second) {
        double ave = (first+second)/2;
        System.out.println("Average is equal with " + ave);
        return ave;
    }
}
