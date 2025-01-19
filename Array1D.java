/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

import java.util.Arrays;

public class Array1D {

    public static void main(String[] args) {
        //Declaration and Initialization
        int[] myArray = new int[5]; 
        System.out.println("Initial Array: " + Arrays.toString(myArray));

        // Adding elements using indexes
        myArray[0] = 10; 
        myArray[1] = 20; 
        myArray[2] = 30; 
        myArray[3] = 40; 
        myArray[4] = 50; 
        System.out.println("After Adding Elements: " + Arrays.toString(myArray));

        //Editing an element
        myArray[2] = 35; 
        System.out.println("After Editing Index 2: " + Arrays.toString(myArray));

        //Deleting an element 
        myArray[3] = 0; 
        System.out.println("After Deleting Index 3: " + Arrays.toString(myArray));
    }
}
