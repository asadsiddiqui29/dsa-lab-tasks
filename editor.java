import java.util.Scanner;

class Node {
    String data;
    Node prev, next;

    public Node(String data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    public void addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void deleteNode(String data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                if (current == head) {
                    head = current.next;
                } else {
                    current.prev.next = current.next;
                }
                if (current == tail) {
                    tail = current.prev;
                } else {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class editor {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete");
            System.out.println("4. Print List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    String data = scanner.next();
                    list.addfirst(data);
                    break;
                case 2:
                    System.out.print("Enter data to insert: ");
                    data = scanner.next();
                    list.addlast(data);
                    break;
                case 3:
                    System.out.print("Enter data to delete: ");
                    data = scanner.next();
                    list.deleteNode(data);
                    break;
                case 4:
                    list.printList();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}