/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

import java.util.Arrays;

public class MissingNumberExample {
    
    public static void main(String[] args) {
        //Initialize the array (missing one number)
        int[] myArray = {1, 2, 4, 5, 6}; // Missing number is 3
        System.out.println("Array: " + Arrays.toString(myArray));

        
        int missingNumber = findMissingNumber(myArray, 6);

        System.out.println("Missing Number: " + missingNumber);
    }

    // Method to find the missing number using the sum formula
    public static int findMissingNumber(int[] array, int n) {
        int expectedSum = n * (n + 1) / 2; 
        int actualSum = 0;

        for (int num : array) {
            actualSum += num; 
        }

        return expectedSum - actualSum; 
    }
}

