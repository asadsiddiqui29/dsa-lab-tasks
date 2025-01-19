/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

import java.util.Arrays;

public class ReversedArray {
    
    public static void main(String[] args) {
        
        int[] myArray = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(myArray));

      
        int start = 0, end = myArray.length - 1;
        while (start < end) {
            
            int temp = myArray[start];
            myArray[start] = myArray[end];
            myArray[end] = temp;

            
            start++;
            end--;
        }

        
        System.out.println("Reversed Array: " + Arrays.toString(myArray));
    }
}

