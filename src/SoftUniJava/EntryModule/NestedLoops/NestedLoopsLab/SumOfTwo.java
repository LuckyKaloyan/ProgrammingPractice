package SoftUniJava.EntryModule.NestedLoops.NestedLoopsLab;

import java.util.Scanner;
public class SumOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lower = Integer.parseInt(scanner.nextLine());
        int higher = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int tries = 0;
        int success = 0;


        for(int i=lower; i<=higher; i++){
            if(success>0){break;}
            for(int k = lower; k<=higher; k++){
                tries++;


                if(k+i==magicNumber){
                    System.out.printf("Combination N:%d",tries);
                    System.out.print(" ("+i+" + "+k+" = "+(i+k)+")");
                    success++;
                    break;
                }

            }
        }
        if(success<1){
            System.out.printf("%d combinations - neither equals %d", tries,magicNumber);
        }






    }
}