package SoftUniJava.EntryModule.WhileLoops.WhileLoopLab;

import java.util.Scanner;
public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxnumber = Integer.MIN_VALUE;
        String stop = "start";

        while(stop.equals("start")){
            String input = scanner.nextLine();
            if(input.equals("Stop")){break;}
            int num = Integer.parseInt(input);
            if(num>maxnumber){maxnumber=num;}
        }
        System.out.println(maxnumber);




    }
}
