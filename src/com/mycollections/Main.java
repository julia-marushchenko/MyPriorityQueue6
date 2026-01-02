/**
 *  Java program to access to elements of PriorityQueue.
 */

package com.mycollections;

import java.util.PriorityQueue;

/**
 * Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating a PriorityQueue instance.
        PriorityQueue<String> myQueue = new PriorityQueue<>();

        // Adding elements to myQueue
        myQueue.add("Geeks");
        myQueue.add("For");
        myQueue.add("Geeks");

        // Access available only to head of the queue.
        System.out.println("Accessed element " + myQueue.peek()); // Output: For

    }
}