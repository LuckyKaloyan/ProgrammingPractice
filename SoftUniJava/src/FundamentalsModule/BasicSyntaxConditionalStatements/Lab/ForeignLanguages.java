package FundamentalsModule.BasicSyntaxConditionalStatements.Lab;

import java.util.Scanner;
public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String input = scanner.nextLine();

        if(input.equals("USA")){System.out.println("English");}
        else if(input.equals("England")){System.out.println("English");}
        else if(input.equals("Spain")){System.out.println("Spanish");}
        else if(input.equals("Mexico")){System.out.println("Spanish");}
        else if(input.equals("Argentina")){System.out.println("Spanish");}
        else{
            System.out.println("unknown");
        }

    }
}
