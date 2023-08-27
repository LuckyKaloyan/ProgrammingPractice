package SoftUniJava.EntryModule.NestedLoops.NestedLoopsLab;

import java.util.Scanner;
public class Travelling {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        double valuepoint;
        double currentvalue = 0;


        while(true){
            String kiufte = scanner.nextLine();
            if(kiufte.equals("End")){break;}
            valuepoint = Double.parseDouble(scanner.nextLine());
            if(valuepoint<=0)
            {
                System.out.println("Going to "+kiufte+"!");
                currentvalue=0;
            }
            while(currentvalue<valuepoint){
                double deposit = Double.parseDouble(scanner.nextLine());
                currentvalue=currentvalue+deposit;
                if(currentvalue>=valuepoint){
                    System.out.println("Going to "+kiufte+"!");
                    currentvalue=0;
                    break;
                }
            }
        }
    }
}
