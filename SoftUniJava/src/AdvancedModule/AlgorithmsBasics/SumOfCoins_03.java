package AlgorithmsBasics;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SumOfCoins_03 {
    public static void main(String[] args) {
        //10 ст, 5 ст, 2 ст, 1 ст
        Scanner scanner = new Scanner(System.in);
        double changeInLv = Double.parseDouble(scanner.nextLine()); //5.67
        int changeInSt = (int) (changeInLv * 100); //567

        Map<Integer, Integer> coinsMap = new LinkedHashMap<>();
        //монета (key) -> бр. срещанията (value)
        coinsMap.put(10, 0);
        coinsMap.put(5, 0);
        coinsMap.put(4, 0);
        coinsMap.put(1, 0);

        while (changeInSt > 0) {
            if (changeInSt >= 10) {
                //мога да го върна с 1 монета от 10 ст
                changeInSt -= 10;
                coinsMap.put(10, coinsMap.get(10) + 1);
            } else if (changeInSt >= 5) {
                //мога да го върна с 1 монета от 5 ст
                changeInSt -= 5;
                coinsMap.put(5, coinsMap.get(5) + 1);
            } else if (changeInSt >= 2) {
                //мога да го върна с 1 монета от 2 ст
                changeInSt -= 2;
                coinsMap.put(2, coinsMap.get(2) + 1);
            } else if (changeInSt >= 1) {
                //мога да го върна с 1 монета от 1 ст
                changeInSt -= 1;
                coinsMap.put(1, coinsMap.get(1) + 1);
            }

        }


        //колко е броя на монетите от 10 ст, с които сме върнали рестото
        System.out.println("10 st: " + coinsMap.get(10));
        //колко е броя на монетите от 5 ст, с които сме върнали рестото
        System.out.println("5 st: " + coinsMap.get(5));
        //колко е броя на монетите от 2 ст, с които сме върнали рестото
        System.out.println("2 st: " + coinsMap.get(2));
        //колко е броя на монетите от 1 ст, с които сме върнали рестото
        System.out.println("1 st: " + coinsMap.get(1));
    }
}
