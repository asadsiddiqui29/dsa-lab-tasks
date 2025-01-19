/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

import java.util.Arrays;

public class MinValueExample {
    
    public static void main(String[] args) {
        // Initialize the array
        int[] myArray = {45, 10, 3, 88, 19};
        System.out.println("Array: " + Arrays.toString(myArray));

        int minValue = findMinimum(myArray);

        System.out.println("Minimum Value: " + minValue);
    }

    // Method to find the minimum value in the array
    public static int findMinimum(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; 
            }
        }

        return min;
    }
}

