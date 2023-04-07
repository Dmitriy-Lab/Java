package org.example;

import static org.example.HeapSort.printArray;

public class Main {
        public static void main(String args[]) {
            int arr[] = {15, 1, 13, 53, 68, 70};

            HeapSort ob = new HeapSort();
            ob.sort(arr);

            System.out.println("Sorted array is:");
            printArray(arr);
        }
    }