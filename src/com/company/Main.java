package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	int count = 0;
        System.out.println("Enter number of digits: ");
        if (scanner.hasNextInt()) {
            count = scanner.nextInt();
            scanner.nextLine();
            int [] newInt = getArray(count);
            System.out.println("Your chosen arrays are: " + Arrays.toString(newInt));

            int [] reverseInt = reversed(newInt);

            System.out.println("The arrays in reverse are: " + Arrays.toString(reverseInt));
        } else {
            System.out.println("Invalid input!");
        }

    }
    public static int [] getArray (int array) {
        int [] arrayLength = new int [array];
        for (int i = 0; i < arrayLength.length; i++) {
            System.out.println("Enter desired number " + array);
            if (scanner.hasNextInt()) {
                arrayLength[i] = scanner.nextInt();
                scanner.nextLine();
                array--;
            } else {
                System.out.println("Invalid input!");
            }
        }
        return arrayLength;
    }
    public static int [] reversed (int [] array) {
        int start = 0;
        int end = array.length -1;
        int temp;

        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start ++;
            end --;
        }
        return array;
    }
}
