package AdvancedModule.FunctionalProgramming.Excercises;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        int filter = Integer.parseInt(scanner.nextLine());
        
        numbers = numbers.stream().filter()




    }
}
