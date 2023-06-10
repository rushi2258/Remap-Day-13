package com.bridgelabz.assignment;

public class PrintArray<T extends Comparable<T>> {

    private T[] array;

    public PrintArray(T[] array) {
        this.array = array;
    }

    public void toPrint() {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static <T extends Comparable<T>> void printMax(T x, T y, T z) {
        T max = testMaximum(x, y, z);
        System.out.println("Maximum value: " + max);
    }

    public static void main(String[] args) {
        Integer[] intArray = { 10, 20, 30 };
        PrintArray<Integer> intPrinter = new PrintArray<>(intArray);
        intPrinter.toPrint();
        printMax(10, 20, 30);

        Double[] doubleArray = { 1.5, 2.3, 0.8 };
        PrintArray<Double> doublePrinter = new PrintArray<>(doubleArray);
        doublePrinter.toPrint();
        printMax(1.5, 2.3, 0.8);

        String[] stringArray = { "apple", "banana", "cherry" };
        PrintArray<String> stringPrinter = new PrintArray<>(stringArray);
        stringPrinter.toPrint();
        printMax("apple", "banana", "cherry");
    }
}
