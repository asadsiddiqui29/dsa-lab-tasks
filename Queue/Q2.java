import java.util.LinkedList;
import java.util.Queue;

public class Q2 {
    public static int getMinimum(Queue<Integer> que) {
        if (que.isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        int min = Integer.MAX_VALUE;
        int size = que.size();

        for (int i = 0; i < size; i++) {
            int current = que.poll();
            if (current < min) {
                min = current;
            }
            que.add(current);
        }

        return min;
    }

    public static void main(String[] args) {
        Q2 list = new Q2();
        Queue<Integer> que = new LinkedList<>();
        que.add(12);
        que.add(5);
        que.add(8);
        que.add(3);
        que.add(10);

        System.out.println("Queue: " + que);

        int min = getMinimum(que);

        System.out.println("Minimum element in the queue: " + min);
    }
}

