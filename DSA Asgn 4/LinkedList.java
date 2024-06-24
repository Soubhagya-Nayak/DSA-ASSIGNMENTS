import java.util.Scanner;

class node {
    int data;
    node next;
}

public class LinkedList {
    static node start = null;

    public static void create() {
        Scanner dk = new Scanner(System.in);
        node p = new node();
        System.out.println("Enter your data: ");
        p.data = dk.nextInt();
        p.next = null;
        start = p;
        node q = p;
        System.out.println("Do you want to create some more nodes(y/n): ");
        char ch = dk.next().charAt(0);
        while (ch != 'n') {
            p = new node();
            System.out.println("Enter your data: ");
            p.data = dk.nextInt();
            p.next = null;
            q.next = p;
            q = p;
            System.out.println("Do you want to create some more nodes(y/n): ");
            ch = dk.next().charAt(0);
        }
        System.out.println("Node created succesfull.");
    }

    public static void display() {
        node p = start;
        while (p != null) {
            System.out.print(p.data + " --> ");
            p = p.next;
        }
    }

    public static void addAtAny(int position, int value) {
        node newNode = new node();
        newNode.data = value;
        if (position == 1) {
            newNode.next = start;
            start = newNode;
        } else {
            node p = start;
            for (int i = 1; i < position - 1 && p != null; i++) {
                p = p.next;
            }
            if (p == null) {
                System.out.println("Ivalid Position.");
                return;
            }
            newNode.next = p.next;
            p.next = newNode;
        }
        System.out.println("Node added succesfully");
    }

    public static void deleteAtAny(int position) {
        if (start == null) {
            System.out.println("List is Empty.");
            return;
        }
        if (position == 1) {
            start = start.next;
        } else {
            node p = start;
            for (int i = 1; i < position - 1 && p != null; i++) {
                p = p.next;
            }
            if (p == null || p.next == null) {
                System.out.println("Invalid position.");
                return;
            }
            p.next = p.next.next;
        }
        System.out.println("Node deleted Succesfully.");
    }

    public static int search(int value) {
        node p = start;
        int position = 1;
        while (p != null) {
            if (p.data == value) {
                return position;
            }
            p = p.next;
            position++;
        }
        return -1;
    }

    public static void addAtBeg(int value) {
        node newNode = new node();
        newNode.data = value;
        newNode.next = start;
        start = newNode;
        System.out.println("Node added Succesfully.");
    }

    public static void addLast(int value) {
        node newNode = new node();
        newNode.data = value;
        if (start == null) {
            start = newNode;
            return;
        }
        node p = start;
        while (p.next != null) {
            p = p.next;
        }
        p.next = newNode;
        System.out.println("Node added Succesdully.");
    }

    public static void deleteFirst() {
        if (start == null) {
            System.out.println("List is Empty.");
            return;
        }
        start = start.next;
        System.out.println("Node delete Succesfully.");
    }

    public static void deleteLast() {
        if (start == null) {
            System.out.println("List is Empty");
            return;
        }
        if (start.next == null) {
            start = null;
        } else {
            node p = start;
            while (p.next.next != null) {
                p = p.next;
            }
            p.next = null;
        }
        System.out.println("Node deleted Succesfully.");
    }

    public static int count() {
        int count = 0;
        node p = start;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    public static int sumOfNodes() {
        int sum = 0;
        node p = start;
        while (p != null) {
            sum += p.data;
            p = p.next;
        }
        return sum;
    }

    public static void reverse() {
        node prev = null;
        node p = start;
        node next = null;
        while (p != null) {
            next = p.next;
            p.next = prev;
            prev = p;
            p = next;
        }
        start = prev;
        System.out.println("List reversed successfully.");
    }

    public static void main(String[] args) {
        Scanner dk = new Scanner(System.in);
        while (true) {
            System.out.println("\n0: Exit");
            System.out.println("1: Create");
            System.out.println("2: display");
            System.out.println("3: Insert At Any Position");
            System.out.println("4: Delete At Any Position");
            System.out.println("5: Add at First");
            System.out.println("6: Add at last");
            System.out.println("7: Delete at First");
            System.out.println("8: Delete at Last");
            System.out.println("9: Search");
            System.out.println("10: Count");
            System.out.println("11: Sum of Nodes");
            System.out.println("12: Reverse");
            System.out.println("Enter your Choice: ");
            int choice = dk.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    create();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    System.out.println("Enter the Position: ");
                    int pos = dk.nextInt();
                    System.out.println("Enter the value: ");
                    int val = dk.nextInt();
                    addAtAny(pos, val);
                    break;
                case 4:
                    System.out.println("Enter the position: ");
                    int p = dk.nextInt();
                    deleteAtAny(p);
                    break;
                case 5:
                    System.out.println("Enter the value: ");
                    int v = dk.nextInt();
                    addAtBeg(v);
                    break;
                case 6:
                    System.out.println("Enter the value: ");
                    int va = dk.nextInt();
                    addLast(va);
                    break;
                case 7:
                    deleteFirst();
                    break;
                case 8:
                    deleteLast();
                    break;
                case 9:
                    System.out.println("Enter the value: ");
                    int value = dk.nextInt();
                    search(value);
                    break;
                case 10:
                    System.out.println("The number of nodes in the list: " + count());
                    break;
                case 11:
                    System.out.println("Sum Of Nodes: " + sumOfNodes());
                    break;
                case 12:
                    System.out.print("Reverse list: ");
                    reverse();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}