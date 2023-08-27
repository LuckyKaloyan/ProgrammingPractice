package SoftUniJava.EntryModule.NestedLoops.NestedLoopsExcercises;

import java.util.Scanner;
public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double jury = Double.parseDouble(scanner.nextLine());
        String presentation;
        double total = 0;
        double mark;
        double average;
        double totalaverage=0;
        double times = 0;

        while(true){
            presentation = scanner.nextLine();
            if(presentation.equals("Finish")){
                System.out.printf("Student's final assessment is %02.2f.", totalaverage/times);
                System.out.println();

                break;}
            else{
                times++;
                for(int i =0; i<jury; i++){
                    mark = Double.parseDouble(scanner.nextLine());
                    total = total+mark;
                }
                average=total/jury;
                totalaverage=totalaverage+average;
                System.out.printf("%s - %02.2f.",presentation,average);
                System.out.println();
                total = 0;
            }

        }




    }
}