package TestingTrash;
import java.util.*;
import java.util.function.BiFunction;

public class Lambda {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BiFunction<Integer, Integer, Integer> sum = (a,b) -> a+b;
        int result = sum.apply(1,4);
        System.out.println("Result: "+result);







    }
}
