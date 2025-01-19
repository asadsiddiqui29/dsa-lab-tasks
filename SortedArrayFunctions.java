/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

import java.util.Arrays;

public class SortedArrayFunctions {
    
    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(sortedArray));

        // Search for an element
        int key = 30;
        int index = search(sortedArray, key);
        System.out.println(key + " found at index: " + index);

        // Insert a new element
        int newElement = 25;
        sortedArray = insert(sortedArray, newElement);
        System.out.println("Array After Insertion: " + Arrays.toString(sortedArray));

        // Delete an element
        int elementToDelete = 40;
        sortedArray = delete(sortedArray, elementToDelete);
        System.out.println("Array After Deletion: " + Arrays.toString(sortedArray));
    }

    // Search method
    public static int search(int[] array, int key) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Insert method
    public static int[] insert(int[] array, int element) {
        int[] newArray = new int[array.length + 1];
        int i = 0;

        // Copy elements and find the position to insert
        while (i < array.length && array[i] < element) {
            newArray[i] = array[i];
            i++;
        }

        // Insert the new element
        newArray[i] = element;

        // Copy the remaining elements
        for (int j = i; j < array.length; j++) {
            newArray[j + 1] = array[j];
        }

        return newArray;
    }

    // Delete an element method
    public static int[] delete(int[] array, int element) {
        int index = search(array, element);
        if (index == -1) {
            System.out.println(element + " not found in the array.");
            return array;
        }

        int[] newArray = new int[array.length - 1];
        int i = 0;

        // Copy elements, skipping the one to delete
        for (int j = 0; j < array.length; j++) {
            if (j != index) {
                newArray[i++] = array[j];
            }
        }

        return newArray;
    }
}

