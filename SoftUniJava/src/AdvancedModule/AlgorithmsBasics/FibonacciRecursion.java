package AdvancedModule.AlgorithmsBasics;

import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(calcFib(n));

    }

    public static long calcFib (int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return calcFib(n - 1) + calcFib(n - 2);
    }
}
