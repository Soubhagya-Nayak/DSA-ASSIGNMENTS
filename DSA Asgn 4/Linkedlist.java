import java.util.*;

class node {
    int info;
    node next;
}

public class Linkedlist {
    static node start = null;

    public static void create() {
        Scanner sc = new Scanner(System.in);
        node p = new node();
        System.out.println("Enter info");
        p.info = sc.nextInt();
        p.next = null;
        start = p;
        node q = p;
        System.out.println("Do you want to create more number of nodes(y/n)");
        char ch = sc.next().charAt(0);
        while (ch != 'n') {
            p = new node();
            System.out.println("Enter info");
            p.info = sc.nextInt();
            p.next = null;
            q.next = p;
            q = p;
            System.out.println("Do you want to create more number of nodes(y/n)");
            ch = sc.next().charAt(0);
        }
    }

    public static void display() {
        node p = start;
        while (p != null) {
            System.out.print(p.info + "-->");
            p = p.next;
        }
    }

    public static void insertNode(int position, int value) {
        node newNode = new node();
        newNode.info = value;
        if (position == 1) {
            newNode.next = start;
            start = newNode;
        } else {
            node p = start;
            for (int i = 1; i < position - 1 && p != null; i++) {
                p = p.next;
            }
            if (p == null) {
                System.out.println("Invalid position");
                return;
            }
            newNode.next = p.next;
            p.next = newNode;
        }
        System.out.println("Node inserted successfully");
    }

    public static void deleteNode(int position) {
        if (start == null) {
            System.out.println("List is empty");
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
                System.out.println("Invalid position");
                return;
            }
            p.next = p.next.next;
        }
        System.out.println("Node deleted successfully");
    }

    public static int search(int value) {
        node p = start;
        int position = 1;
        while (p != null) {
            if (p.info == value) {
                return position;
            }
            p = p.next;
            position++;
        }
        return -1;
    }

    public static void reverse() {
        node prev = null;
        node current = start;
        node nextNode = null;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        start = prev;
        System.out.println("List reversed successfully");
    }

    public static node reverseRecursive(node curr, node prev) {
        if (curr == null)
            return prev;
        node nextNode = curr.next;
        curr.next = prev;
        return reverseRecursive(nextNode, curr);
    }

    public static void reverseUsingRecursion() {
        start = reverseRecursive(start, null);
        System.out.println("List reversed successfully using recursion");
    }

    public static void addAtBeginning(int value) {
        node newNode = new node();
        newNode.info = value;
        newNode.next = start;
        start = newNode;
        System.out.println("Node added at the beginning successfully");
    }

    public static void addAtEnd(int value) {
        node newNode = new node();
        newNode.info = value;
        if (start == null) {
            start = newNode;
            return;
        }
        node p = start;
        while (p.next != null) {
            p = p.next;
        }
        p.next = newNode;
        System.out.println("Node added at the end successfully");
    }

    public static void bubbleSort() {
        if (start == null || start.next == null) {
            return;
        }
        node current;
        node tail = null;
        boolean swapped;
        do {
            swapped = false;
            current = start;
            while (current.next != tail) {
                if (current.info > current.next.info) {
                    int temp = current.info;
                    current.info = current.next.info;
                    current.next.info = temp;
                    swapped = true;
                }
                current = current.next;
            }
            tail = current;
        } while (swapped);
        System.out.println("List sorted successfully using Bubble Sort");
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n****MENU*****");
            System.out.println("0:Exit");
            System.out.println("1:Creation");
            System.out.println("2:Display");
            System.out.println("3:Insertion");
            System.out.println("4:Deletion");
            System.out.println("5:Search");
            System.out.println("6:Reverse");
            System.out.println("7:Reverse using recursion");
            System.out.println("8:Add Node at the Beginning");
            System.out.println("9:Add Node at the End");
            System.out.println("10:Bubble Sort");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the choice");
            int choice = sc.nextInt();
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
                    System.out.println("Enter the position to insert:");
                    int insertPosition = sc.nextInt();
                    System.out.println("Enter the value to insert:");
                    int insertValue = sc.nextInt();
                    insertNode(insertPosition, insertValue);
                    break;
                case 4:
                    System.out.println("Enter the position to delete:");
                    int deletePosition = sc.nextInt();
                    deleteNode(deletePosition);
                    break;
                case 5:
                    System.out.println("Enter the value to search:");
                    int searchValue = sc.nextInt();
                    int result = search(searchValue);
                    if (result != -1) {
                        System.out.println("Value found at position: " + result);
                    } else {
                        System.out.println("Value not found");
                    }
                    break;
                case 6:
                    reverse();
                    break;
                case 7:
                    reverseUsingRecursion();
                    break;
                case 8:
                    System.out.println("Enter the value to add at the beginning:");
                    int addAtBeginValue = sc.nextInt();
                    addAtBeginning(addAtBeginValue);
                    break;
                case 9:
                    System.out.println("Enter the value to add at the end:");
                    int addAtEndValue = sc.nextInt();
                    addAtEnd(addAtEndValue);
                    break;
                case 10:
                    bubbleSort();
                    break;
                default:
                    System.out.println("Wrong choice");

            }
        }
    }
}
