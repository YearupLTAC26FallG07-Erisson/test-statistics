package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        // 1. Create an array of 10 test scores
        double[] scores = {88.5, 92.0, 79.0, 65.5, 95.0, 81.0, 74.5, 91.0, 83.0, 89.5};

        // Initialize variables for calculations
        double sum = 0;
        double highScore = scores[0];
        double lowScore = scores[0];

        // 2. Loop through the array to find sum, high, and low scores
        for (double score : scores) {
            sum += score;

            if (score > highScore) {
                highScore = score;
            }
            if (score < lowScore) {
                lowScore = score;
            }
        }

        // Calculate the average
        double average = sum / scores.length;

        // Print the primary statistics
        System.out.printf("Average Score: %.2f%n", average);
        System.out.println("High Score: " + highScore);
        System.out.println("Low Score: " + lowScore);

        // 3. BONUS: Calculate the median value
        Arrays.sort(scores); // Sort the array first
        double median;

        // Since array length is 10 (even), average the two middle elements
        int mid1 = scores.length / 2 - 1;
        int mid2 = scores.length / 2;
        median = (scores[mid1] + scores[mid2]) / 2.0;

        // Calculate the absolute difference between average and median
        double difference = Math.abs(average - median);

        // Print bonus results
        System.out.println("Median Value: " + median);
        System.out.printf("Difference (Average vs Median): %.2f%n", difference);
    }
}
