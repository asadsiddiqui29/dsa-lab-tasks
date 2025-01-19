import java.util.Scanner;
import java.util.Stack;

public class Stackss {

    public static void reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        String reversedStr = "";
        while (!stack.isEmpty()) {
            reversedStr += stack.pop();
        }

        System.out.println("Reversed string: " + reversedStr);
    }

    public static void reverseNumber(int num) {
        Stack<Integer> stack = new Stack<>();
        while (num > 0) {
            stack.push(num % 10);
            num /= 10;
        }

        int reversedNum = 0;
        while (!stack.isEmpty()) {
            reversedNum = reversedNum * 10 + stack.pop();
        }

        System.out.println("Reversed number: " + reversedNum);
    }

    public static int searchElement(Stack<Integer> stack, int element) {
        Stack<Integer> tempStack = new Stack<>();
        int position = 1;

        while (!stack.isEmpty()) {
            int topElement = stack.pop();
            tempStack.push(topElement);

            if (topElement == element) {
                return position;
            }
            position++;
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        return -1;
    }

    public static int peek(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack.peek();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        reverseString(str);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        reverseNumber(num);

        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter elements for the stack (enter -1 to stop):");
        int element;
        while ((element = scanner.nextInt()) != -1) {
            stack.push(element);
        }

        System.out.print("Enter an element to search: ");
        int searchElement = scanner.nextInt();
        int position = searchElement(stack, searchElement);
        if (position != -1) {
            System.out.println("Element found at position: " + position);
        } else {
            System.out.println("Element not found in the stack.");
        }

        System.out.println("Top element of the stack: " + peek(stack));

    }
}