package FundamentalsModule.DataTypes.Exercise;

import java.util.Scanner;
public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        String letter;
        for(int i = 0; i<n; i++){
            letter = scanner.nextLine();
            sum = sum+(int)(letter.charAt(0));

        }
        System.out.println("The sum equals: "+sum);


    }
}
