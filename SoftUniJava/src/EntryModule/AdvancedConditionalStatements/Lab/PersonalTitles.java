package EntryModule.AdvancedConditionalStatements.Lab;

import java.util.Scanner;
public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();


        switch(gender){
            case "f":
                if(age>=16){
                    System.out.println("Ms.");
                }else {
                    System.out.println("Miss");
                }break;
            case "m":
                if(age>=16){
                    System.out.println("Mr.");
                }else{
                    System.out.println("Master");
                }break;
            default :
                System.out.println("Error");
        }

    }
}
