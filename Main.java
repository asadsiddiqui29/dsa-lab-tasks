/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab;



class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int getLength() {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public void printMiddle() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle node is: " + slow.data);
    }

    public LinkedList reverseCopy() {
        if (head == null) return null;

        LinkedList reversedList = new LinkedList();
        Node current = head;

        while (current != null) {
            Node newNode = new Node(current.data);
            newNode.next = reversedList.head;
            reversedList.head = newNode;
            current = current.next;
        }

        return reversedList;
    }

    public void removeDuplicates() {
        if (head == null || head.next == null) return;

        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public static LinkedList mergeSortedLists(LinkedList list1, LinkedList list2) {
        LinkedList resultList = new LinkedList();

        Node dummy = new Node(0);
        Node tail = dummy;

        Node p1 = list1.head;
        Node p2 = list2.head;

        while (p1 != null && p2 != null) {
            if (p1.data <= p2.data) {
                tail.next = new Node(p1.data);
                p1 = p1.next;
            } else {
                tail.next = new Node(p2.data);
                p2 = p2.next;
            }
            tail = tail.next;
        }

        while (p1 != null) {
            tail.next = new Node(p1.data);
            p1 = p1.next;
            tail = tail.next;
        }

        while (p2 != null) {
            tail.next = new Node(p2.data);
            p2 = p2.next;
            tail = tail.next;
        }

        resultList.head = dummy.next;
        return resultList;
    }
    

    public void deleteList() {
        head = null;
        System.out.println("The list has been deleted.");
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Length of list: " + list.getLength());
        list.printMiddle();

        LinkedList reversed = list.reverseCopy();
        System.out.print("Reversed list: ");
        Node current = reversed.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

        list.add(50);
        list.add(50);
        list.removeDuplicates();
        System.out.print("List after removing duplicates: ");
        current = list.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

        LinkedList list2 = new LinkedList();
        list2.add(15);
        list2.add(25);
        list2.add(35);
        LinkedList merged = LinkedList.mergeSortedLists(list, list2);
        System.out.print("Merged list: ");
        current = merged.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

        list.deleteList();
    }
}


