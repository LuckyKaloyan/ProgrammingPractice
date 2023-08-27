package SoftUniJava.EntryModule.NestedLoops.NestedLoopsLab;

import java.util.Scanner;
public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int combinations = 0;

        for(int i = 0; i<=input; i++){
            for(int k = 0; k<=input; k++){
                for(int j = 0; j<=input; j++){
                    if(i+k+j==input){combinations++;}
                }
            }
        }
        System.out.println(combinations);


    }
}