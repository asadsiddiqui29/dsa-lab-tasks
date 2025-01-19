/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

import java.util.Arrays;

public class ResizeArray {
    
    public static void main(String[] args) {
        
        int[] myArray = {10, 20, 30};
        System.out.println("Original Array: " + Arrays.toString(myArray));

        // Resize the array to a larger size
        myArray = resizeArray(myArray, 5); 
        System.out.println("Array After Expanding: " + Arrays.toString(myArray));

        //Resize the array to a smaller size
        myArray = resizeArray(myArray, 2); 
        System.out.println("Array After Shrinking: " + Arrays.toString(myArray));
    }

    // Method to resize an array
    public static int[] resizeArray(int[] originalArray, int newSize) {
        int[] newArray = new int[newSize]; 

        // Copy elements from the old array to the new array
        for (int i = 0; i < Math.min(originalArray.length, newSize); i++) {
            newArray[i] = originalArray[i];
        }

        return newArray; // Return the new array
    }
}

