package org.fasttrackit;

public class Numbers {


    public int calc (int first, int second) {
        int sum = first + second;
        System.out.println("Sum is equal with  " + sum);
        return sum;
    }
    public double calc (double first, double second) {
        double sum = first + second;
        System.out.println("Sum is equal with  " + sum);
        return sum;
    }
    public int multiply (int first, int second) {
        int multi = first * second;
        System.out.println("Multiply is equal with " + multi);
        return multi;
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
    public int divide (int first, int second) {
        int div = first/second;
        System.out.println("Divide is equal with " + div);
        return div;
    }
    public double average (double first, double second) {
        double ave = (first+second)/2;
        System.out.println("Average is equal with " + ave);
        return ave;
    }
    public int average (int first, int second) {
        int ave = (first+second)/2;
        System.out.println("Average is equal with " + ave);
        return ave;
    }
}
