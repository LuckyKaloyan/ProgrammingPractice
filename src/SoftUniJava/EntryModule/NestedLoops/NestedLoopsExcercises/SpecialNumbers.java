package SoftUniJava.EntryModule.NestedLoops.NestedLoopsExcercises;

import java.util.Scanner;
public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int one;
        int two;
        int three;
        int four;

        for(int i = 1111; i<9999; i++){
            String h = String.valueOf(i);
            one = Integer.parseInt(String.valueOf(h.charAt(0)));
            two = Integer.parseInt(String.valueOf(h.charAt(1)));
            three = Integer.parseInt(String.valueOf(h.charAt(2)));
            four = Integer.parseInt(String.valueOf(h.charAt(3)));

            if(one==0 || two==0 || three==0 || four==0){}
            else if(n%one==0 && n%two==0 && n%three==0 && n%four==0){
                System.out.print(i+" ");
            }
        }







    }
}
