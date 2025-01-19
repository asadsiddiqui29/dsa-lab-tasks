import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class que {
    public static void reverseFirstK(Queue<Integer> queue, int k) {
        if (queue.isEmpty() || k > queue.size() || k <= 0) {
            System.out.println("Invalid value of K.");
            return;
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        int size = queue.size();
        for (int i = 0; i < size - k; i++) {
            queue.add(queue.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Original Queue: " + queue);

        reverseFirstK(queue, 3);

        System.out.println("Queue after reversing first 3 elements: " + queue);
    }
}
