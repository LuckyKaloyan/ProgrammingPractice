package EntryModule.AdvancedConditionalStatements.Lab;

import java.util.Scanner;
public class AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input){
            case "dog":
                System.out.println("mammal");
                break;
            case "snake":
            case "tortoise":
            case "crocodile":
                System.out.println("reptile");
                break;
            default :
                System.out.println("unknown");

        }





    }
}
