package SoftUniJava.EntryModule.NestedLoops.NestedLoopsExcercises;

import java.util.Scanner;
public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double countkid = 0;
        double countstudent = 0;
        double countstandard = 0;
        int ticketstotal = 0;
        int tickets = 0;


        while(true){
            String moviename = scanner.nextLine();
            if(moviename.equals("Finish")){
                System.out.printf("Total tickets: %d", ticketstotal);
                System.out.println();
                System.out.printf("%02.2f", countstudent/ticketstotal*100); System.out.print("% student tickets.");
                System.out.println();
                System.out.printf("%02.2f", countstandard/ticketstotal*100); System.out.print("% standard tickets.");
                System.out.println();
                System.out.printf("%02.2f", countkid/ticketstotal*100); System.out.print("% kids tickets.");


                break;}
            double emptyseats = Integer.parseInt(scanner.nextLine());
            for(int i =0; i<emptyseats; i++){
                String type = scanner.nextLine();
                if(type.equals("End")){break;}
                tickets++;
                if(type.equals("kid")){countkid++;}
                if(type.equals("standard")){countstandard++;}
                if(type.equals("student")){countstudent++;}

            }
            System.out.printf("%s - %02.2f", moviename,(tickets/emptyseats)*100);System.out.print("% full.");
            System.out.println();
            ticketstotal=ticketstotal+tickets;
            tickets=0;
        }






    }
}
