package AlgorithmsBasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      List<Integer> numbers = Arrays.stream(scanner.nextLine()
                                .split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        //{4, 2, 56, 23, 45}
        Collections.sort(numbers); //sort in ascending order (нарастващ ред)
        //{2, 4, 23, 45, 56}

        List<Integer> numbersList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //{4, 2, 56, 23, 45}
        Collections.sort(numbersList); //sort in ascending order (нарастващ ред) -> {2, 4, 23, 45, 56}
        Collections.reverse(numbersList); //sort in descending order (намаляващ ред)
        //{56, 45, 23, 4, 2}

    }
}
