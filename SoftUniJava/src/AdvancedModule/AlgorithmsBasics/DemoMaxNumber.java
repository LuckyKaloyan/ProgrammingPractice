package AdvancedModule.AlgorithmsBasics;

import java.util.Arrays;
import java.util.Scanner;

public class DemoMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        //array = [12, 34, 98, 3, 4, 18]
        int max = Integer.MIN_VALUE;
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
    }
}
