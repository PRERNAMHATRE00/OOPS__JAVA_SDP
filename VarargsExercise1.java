package com.infy.varargs;

import java.util.Arrays;

public class VarargsExercise1 {
    public static void main(String[] args) {
        VarargsExercise1 ve = new VarargsExercise1();
        
        // Example usage with variable arguments
        ve.displayList(4, 8, 2, 10, 5);
        ve.maxOfList(4, 8, 2, 10, 5);
        ve.sortList(4, 8, 2, 10, 5);
        ve.averageList(4, 8, 2, 10, 5);
    }

    public void displayList(int... input) {
        System.out.println("Items in the list:");
        for (int item : input) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public void maxOfList(int... input) {
        int max = Integer.MIN_VALUE;
        for (int item : input) {
            if (item > max) {
                max = item;
            }
        }
        System.out.println("Maximum value in the list: " + max);
    }

    public void sortList(int... input) {
        Arrays.sort(input);
        System.out.println("Sorted list: " + Arrays.toString(input));
    }

    public void averageList(int... input) {
        int sum = 0;
        for (int item : input) {
            sum += item;
        }
        double average = (double) sum / input.length;
        System.out.println("Average of items in the list: " + average);
    }
}
