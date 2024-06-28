package AdvancedModule.FunctionalProgramming.Exercise;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String word = scanner.nextLine();

        Function<int[], int[]> add = s ->{
            for(int i =0; i<s.length; i++){
                s[i]=s[i]+1;
            }
            return s;
        };
        Function<int[], int[]> subtract = s ->{
            for(int i =0; i<s.length; i++){
                s[i]=s[i]-1;
            }
            return s;
        };
        Function<int[], int[]> multiply = s ->{
            for(int i =0; i<s.length; i++){
                s[i]=s[i]*2;
            }
            return s;
        };
        Consumer<int[]> print = arr ->Arrays.stream(arr).forEach(e-> System.out.print(e+" "));
        while(!word.equals("end")){
            if(word.equals("add")){
                numbers = add.apply(numbers);
            }else if(word.equals("subtract")){
                numbers = subtract.apply(numbers);
            }else if(word.equals("multiply")){
                numbers = multiply.apply(numbers);
            }else if(word.equals("print")){
                print.accept(numbers);
                System.out.println();
            }


            word = scanner.nextLine();
            if(word.equals("end")){
                scanner.close();
                break;
            }
        }
    }
}