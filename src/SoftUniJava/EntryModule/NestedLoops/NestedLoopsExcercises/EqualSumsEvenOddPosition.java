package SoftUniJava.EntryModule.NestedLoops.NestedLoopsExcercises;

import java.util.Scanner;
public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());

        for (int i=min; i<=max ; i++) {

            int first = i/100000;
            int second = (i/10000)%10;
            int third = (i/1000)%10;
            int fourth = (i/100)%10;
            int fifth = (i/10)%10;
            int sixth= i%10;

            int oddSum = first + third + fifth;
            int evenSum = second + fourth + sixth;

            if(oddSum == evenSum){
                System.out.printf("%d ", i);
            }
        }
    }
}