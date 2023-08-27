package SoftUniJava.EntryModule.NestedLoops.NestedLoopsLab;

import java.util.Scanner;
public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int numberAparts = Integer.parseInt(scanner.nextLine());

        for(int i=floors; i>0; i--){
            for(int k=0; k<numberAparts; k++){
                if(i==floors){
                    System.out.print("L"+i+k+" ");
                }else if(i%2==0){
                    System.out.print("O"+i+k+" ");
                }else {System.out.print("A"+i+k+" ");}
            }
            System.out.println();
        }
    }
}
