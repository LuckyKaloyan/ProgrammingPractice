package AdvancedModule.SetsAndMaps.Lab;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class VoinaGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstdeck = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .boxed()
                        .collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> seconddeck = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .boxed()
                        .collect(Collectors.toCollection(LinkedHashSet::new));


           int firstNumber = firstdeck.iterator().next();
           firstdeck.remove(firstNumber);
           int secondNumber = seconddeck.iterator().next();
           seconddeck.remove(secondNumber);
           

    }
}
