package SoftUniJava.EntryModule.NestedLoops.NestedLoopsExcercises;

import java.util.Scanner;
public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        int evenone = 0;
        int sumprime = 0;
        int sumnonprime = 0;

        while(true){
            input = scanner.nextLine();
            if(input.equals("stop")){break;}
            int number = Integer.parseInt(input);
            if(number<0){
                System.out.println("Number is negative.");
            }else{for(int i=2; i<number; i++){
                if(number%i==0){evenone++;}
            }
                if(evenone>0){sumnonprime=sumnonprime+number;
                    evenone=0;}
                else{sumprime=sumprime+number;}}

        }
        System.out.printf("Sum of all prime numbers is: %d", sumprime);
        System.out.println();
        System.out.printf("Sum of all non prime numbers is: %d", sumnonprime);
    }

}