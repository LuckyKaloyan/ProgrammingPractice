package SoftUniJava.EntryModule.NestedLoops.NestedLoopsExcercises;

import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int rowtimes = 0;
        int currentrowrecord = 1;


        for(int i = 1; i<=number; i++){
            System.out.print(i+" ");
            rowtimes++;
            if(rowtimes==currentrowrecord){currentrowrecord++;
                System.out.println();
                rowtimes=0;}

        }
    }
}