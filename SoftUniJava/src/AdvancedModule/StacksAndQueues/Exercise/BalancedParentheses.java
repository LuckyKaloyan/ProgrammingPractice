package AdvancedModule.StacksAndQueues.Exercise;
import java.util.ArrayDeque;
import java.util.Scanner;
public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sequence = sc.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean areBalanced = true;
        for (int i = 0; i < sequence.length(); i++) {
            char current = sequence.charAt(i);
            if (current == '[' || current == '{' || current == '(') {
                stack.push(current);
            } else {
                if (stack.isEmpty()) {
                    areBalanced = false;
                    break;
                }
                char topElement = stack.pop();
                if (current == ']' && topElement != '[') {
                    areBalanced = false;
                    break;
                } else if (current == '}' && topElement != '{') {
                    areBalanced = false;
                    break;
                } else if (current == ')' && topElement != '(') {
                    areBalanced = false;
                    break;
                }
            }
        }
        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}