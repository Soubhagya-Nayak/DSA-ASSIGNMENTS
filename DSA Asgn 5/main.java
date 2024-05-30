import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;

    public Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
        this.prev = null;
    }
}

public class main {
    public static Node create(Node start, Node end) {
        Scanner dk = new Scanner(System.in);
        System.out.print("Enter registration number: ");
        int regd_no = dk.nextInt();
        System.out.print("Enter marks: ");
        float mark = dk.nextFloat();
        Node newNode = new Node(regd_no, mark);
        if (start == null) {
            start = end = newNode;
        } else {
            end.next = newNode;
            newNode.prev = end;
            end = newNode;
        }
        return start;
    }

    public static Node insBeg(Node start, Node end) {
        Scanner dk = new Scanner(System.in);
        System.out.print("Enter registration number: ");
        int regd_no = dk.nextInt();
        System.out.print("Enter marks: ");
        float mark = dk.nextFloat();
        Node newNode = new Node(regd_no, mark);
        if (start == null) {
            start = end = newNode;
        } else {
            newNode.next = start;
            start.prev = newNode;
            start = newNode;
        }
        return start;
    }

    public static Node insEnd(Node start, Node end) {
        Scanner dk = new Scanner(System.in);
        System.out.print("Enter registration number: ");
        int regd_no = dk.nextInt();
        System.out.print("Enter marks: ");
        float mark = dk.nextFloat();
        Node newNode = new Node(regd_no, mark);
        if (end == null) {
            start = end = newNode;
        } else {
            end.next = newNode;
            newNode.prev = end;
            end = newNode;
        }
        return start;
    }

    public static Node insAny(Node start, Node end) {
        Scanner dk = new Scanner(System.in);
        System.out.print("Enter position to insert: ");
        int position = dk.nextInt();
        System.out.print("Enter registration number: ");
        int regd_no = dk.nextInt();
        System.out.print("Enter marks: ");
        float mark = dk.nextFloat();
        Node newNode = new Node(regd_no, mark);
        if (position == 1) {
            return insBeg(start, end);
        } else {
            Node temp = start;
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null && temp.next != null) {
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next.prev = newNode;
                temp.next = newNode;
            } else {
                System.out.println("Position out of range. Inserting at the end.");
                return insEnd(start, end);
            }
        }
        return start;
    }

    public static Node delBeg(Node start, Node end) {
        if (start == null) {
            System.out.println("List is empty.");
            return start;
        }
        if (start == end) {
            start = end = null;
        } else {
            start = start.next;
            start.prev = null;
        }
        return start;
    }

    public static Node delEnd(Node start, Node end) {
        if (end == null) {
            System.out.println("List is empty.");
            return start;
        }
        if (start == end) {
            start = end = null;
        } else {
            end = end.prev;
            end.next = null;
        }
        return start;
    }

    public static Node delAny(Node start, Node end) {
        Scanner dk = new Scanner(System.in);
        System.out.print("Enter position to delete: ");
        int position = dk.nextInt();
        if (position == 1) {
            return delBeg(start, end);
        } else {
            Node temp = start;
            for (int i = 1; i < position && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                if (temp.next != null) {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                } else {
                    return delEnd(start, end);
                }
            } else {
                System.out.println("Position out of range.");
            }
        }
        return start;
    }

    public static void search(Node start) {
        Scanner dk = new Scanner(System.in);
        System.out.print("Enter registration number to search: ");
        int regd_no = dk.nextInt();
        Node temp = start;
        while (temp != null && temp.regd_no != regd_no) {
            temp = temp.next;
        }
        if (temp != null) {
            System.out.print("Enter new marks: ");
            float mark = dk.nextFloat();
            temp.mark = mark;
            System.out.println("Mark updated.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void display(Node start, Node end) {
        Node temp = start;
        while (temp != null) {
            System.out.println("Regd No: " + temp.regd_no + ", Marks: " + temp.mark);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner dk = new Scanner(System.in);
        Node start = null, end = null;
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create");
            System.out.println("2. Insert at Beginning");
            System.out.println("3. Insert at End");
            System.out.println("4. Insert at Any Position");
            System.out.println("5. Delete from Beginning");
            System.out.println("6. Delete from End");
            System.out.println("7. Delete from Any Position");
            System.out.println("8. Search and Update");
            System.out.println("9. Display");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = dk.nextInt();
            switch (choice) {
                case 1:
                    start = create(start, end);
                    if (end == null) end = start;
                    break;
                case 2:
                    start = insBeg(start, end);
                    if (end == null) end = start;
                    break;
                case 3:
                    start = insEnd(start, end);
                    if (end == null) end = start;
                    break;
                case 4:
                    start = insAny(start, end);
                    if (end == null) end = start;
                    break;
                case 5:
                    start = delBeg(start, end);
                    if (start == null) end = start;
                    break;
                case 6:
                    start = delEnd(start, end);
                    if (start == null) end = start;
                    break;
                case 7:
                    start = delAny(start, end);
                    if (start == null) end = start;
                    break;
                case 8:
                    search(start);
                    break;
                case 9:
                    display(start, end);
                    break;
                case 10:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}