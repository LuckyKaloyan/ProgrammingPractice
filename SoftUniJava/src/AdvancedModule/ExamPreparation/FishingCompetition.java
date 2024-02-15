package AdvancedModule.ExamPreparation;
import java.util.Scanner;
public class FishingCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String[][] field = new String[size][size];

        for(int i=0; i<size; i++){
            field[i]=scanner.nextLine().split("");
        }
        




    }
}
