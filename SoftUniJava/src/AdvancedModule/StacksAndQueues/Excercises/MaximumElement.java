package AdvancedModule.StacksAndQueues.Excercises;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.*;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> maxStack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            switch (command[0]) {
                case "1":
                    int x = Integer.parseInt(command[1]);
                    stack.push(x);
                    if (maxStack.isEmpty() || x >= maxStack.peek()) {
                        maxStack.push(x);
                    }
                    break;
                case "2":
                    if (!stack.isEmpty()) {
                        int popped = stack.pop();
                        if (popped == maxStack.peek()) {
                            maxStack.pop();
                        }
                    }
                    break;
                case "3":
                    if (!maxStack.isEmpty()) {
                        System.out.println(maxStack.peek());
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
