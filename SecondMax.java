/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

import java.util.Arrays;

public class SecondMax {
    
    public static void main(String[] args) {
        // Initialize the array
        int[] myArray = {10, 20, 5, 50, 30, 50};
        System.out.println("Array: " + Arrays.toString(myArray));

        
        int secondMax = findSecondMax(myArray);

        System.out.println("Second Maximum Value: " + secondMax);
    }

    // Method to find the second maximum value in the array
    public static int findSecondMax(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int max = Integer.MIN_VALUE;         
        int secondMax = Integer.MIN_VALUE;  

        for (int num : array) {
            if (num > max) {
                secondMax = max; 
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second distinct maximum value found.");
        }

        return secondMax;
    }
}

