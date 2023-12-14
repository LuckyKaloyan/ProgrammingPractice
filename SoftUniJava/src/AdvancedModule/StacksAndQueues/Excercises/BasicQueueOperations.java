package AdvancedModule.StacksAndQueues.Excercises;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] inputParams = scanner.nextLine().split(" ");
        int N = Integer.parseInt(inputParams[0]);
        int S = Integer.parseInt(inputParams[1]);
        int X = Integer.parseInt(inputParams[2]);

        String[] numbers = scanner.nextLine().split(" ");

        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            queue.offer(Integer.parseInt(numbers[i]));
        }

        for (int i = 0; i < S; i++) {
            if (!queue.isEmpty()) {
                queue.poll();
            }
        }

        if (queue.contains(X)) {
            System.out.println("true");
        } else if (!queue.isEmpty()) {
            int min = Integer.MAX_VALUE;
            for (int num : queue) {
                if (num < min) {
                    min = num;
                }
            }
            System.out.println(min);
        } else {
            System.out.println(0);
        }
    }
}
