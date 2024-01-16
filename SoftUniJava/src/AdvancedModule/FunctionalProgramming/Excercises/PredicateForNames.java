package AdvancedModule.FunctionalProgramming.Excercises;
<<<<<<< HEAD


=======
>>>>>>> 3062c12b3f36652b09a480d11a812aa17b801119
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

<<<<<<< HEAD
public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int i = Integer.parseInt(scanner.nextLine());
       String kebab = scanner.nextLine();
        Predicate<String> opa = s -> s.length()<=i;
       String[] kebabta = Arrays.stream(kebab.split(" ")).filter(opa).toArray(String[]::new);

       for(String lesh:kebabta){
           System.out.println(lesh);
       }















    }
}
=======

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());
        String kebab = scanner.nextLine();
        Predicate<String> opa = s -> s.length()<=i;
        String[] kebabta = Arrays.stream(kebab.split(" ")).filter(opa).toArray(String[]::new);

        for(String lesh:kebabta){
            System.out.println(lesh);
        }
    }
}
>>>>>>> 3062c12b3f36652b09a480d11a812aa17b801119
