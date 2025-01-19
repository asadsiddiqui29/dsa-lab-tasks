/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

import java.util.Arrays;

public class MovesZeroes {
    
    public static void main(String[] args) {
        
        int[] myArray = {0, 1, 0, 3, 12, 0, 5};
        System.out.println("Original Array: " + Arrays.toString(myArray));

       
        moveZeroesToEnd(myArray);

        
        System.out.println("Array After Moving Zeroes: " + Arrays.toString(myArray));
    }

    
    public static void moveZeroesToEnd(int[] array) {
        int nonZeroIndex = 0; 

        
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[nonZeroIndex++] = array[i];
            }
        }

       
        while (nonZeroIndex < array.length) {
            array[nonZeroIndex++] = 0;
        }
    }
}
