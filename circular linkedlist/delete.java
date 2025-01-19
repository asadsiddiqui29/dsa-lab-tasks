public class delete {
    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node tail = null;

    public void traverse() {
        if (tail == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = tail.next;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != tail.next);
        System.out.println("(back to start)");
    }

    public void addfirst(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
        }
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }


    // 7. Delete node at a specific position
    public void deleteAtPosition(int position) {
        if (tail == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = tail.next;
        int count = 1;
        while (count < position - 1 && current.next != tail.next) {
            current = current.next;
            count++;
        }
        if (current.next == tail.next) {
            System.out.println("Position out of range.");
        } else {
            current.next = current.next.next;
            if (current.next == tail.next) {
                tail = current;
            }
        }
    }

    public static void main(String[] args) {
        delete list = new delete();

        // Insertions
        list.addfirst(2);
        list.addlast(3);
        list.addfirst(1);
        list.traverse();
        // list.insertAfter(10, 15);

        // System.out.println("List after insertions:");
        // list.traverse();

        // list.deletefirst();
        // System.out.println("List after deleting head:");
        // list.traverse();

        // list.deletelast();
        // System.out.println("List after deleting end:");
        // list.traverse();

        list.deleteAtPosition(1);
        System.out.println("List after deleting at position 1:");
        list.traverse();
    }
}
