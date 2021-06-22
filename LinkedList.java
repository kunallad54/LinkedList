import java.util.Scanner;

/**
 * Ability to delete the first element in the LinkedList of sequence 56->30->70 - Write pop method
 * - Note there is new head
 * - Final Sequence: 30->70
 * 
 * Here it can insert,create,and can delete first element of linked list
 *
 * @author Krunal Lad
 * @Since 22-06-2021
 */
public class LinkedList {
    static LinkedList linkedList = new LinkedList();
    static Scanner scanner = new Scanner(System.in);
    private INode head;
    private INode tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    int size() {
        return this.size;
    }

    public static void main(String[] args) {

        boolean flag = true;
        while (flag) {
            int choice = linkedList.userConsole();
            switch (choice) {
                case 1:
                    linkedList.createLinkedList();
                    break;
                case 2:
                    System.out.println("Enter the data you want to insert");
                    Integer element = scanner.nextInt();
                    System.out.println("Enter the position where you want to insert the data ");
                    int position = scanner.nextInt();
                    linkedList.insertNewNode(element, position);
                    break;
                case 3:
                    linkedList.popFirst();
                    break;
                case 4:
                    linkedList.printLinkedList();
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
    }

    // user console
    public int userConsole() {
        System.out.println("Press 1 to create Linked List");
        System.out.println("Press 2 to insert element in  Linked List");
        System.out.println("Press 3 to delete first element of Linked List");
        System.out.println("Press 4 to display Linked List");
        System.out.println("Press 5 to EXIT ");

        return scanner.nextInt();
    }

    // creates linked list
    public void createLinkedList() {
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the data to insert in the linked list : ");
            Integer key = scanner.nextInt();
            Node<Integer> newNode = new Node<Integer>(key);
            linkedList.append(newNode);
            size++;
            System.out.println("Want to add more elements ? Press 1 \n Press 0 to exit");
            int userChoice = scanner.nextInt();
            if (userChoice == 0)
                flag = false;
        }
        System.out.println("Size is : " + size);
    }

    // adds new nodes to linked list
    private void add(INode newNode) {
        // checks if linked list is empty then head and tail points to first node
        if (head == null)
            head = newNode;
        if (tail == null) {
            tail = newNode;
        } else {
            //temporary node will initially store head value,
            // then new node will become head nad new node next will store old head value
            INode tempNode = head;
            head = newNode;
            head.setNext(tempNode);
        }
    }

    // appends new nodes to linked list
    private void append(INode newNode) {
        // checks if linked list is empty then head and tail points to first node
        if (head == null)
            head = newNode;
        if (tail == null)
            tail = newNode;
        else {
            //temporary node will initially store tail value,
            // then new node will become tail nad temporary node next will point to new node
            INode tempNode = tail;
            tail = newNode;
            tempNode.setNext(newNode);
        }
    }

    // inserting new node at particular position user wants
    public void insertNewNode(Integer element, int position) {

        // to verify index value is in range
        if (position < 0 || position > size)
            System.out.println("Index Number out of range");
        else {
            Node<Integer> newNode = new Node<Integer>(element);
            // if position = 0 then adds element at the first else iterates till position - 1 and inserts element
            if (position == 0) {
                newNode.setNext(head);
                head.setNext(newNode);
            } else {
                INode currentNode = head;
                INode previousNode = null;
                int i = 0;
                // iterates till position - 1
                while (i < position - 1) {
                    previousNode = currentNode;
                    currentNode = currentNode.getNext();
                    i++;
                }
                newNode.setNext(currentNode);
                previousNode.setNext(newNode);
            }
        }
    }

    public void popFirst() {
        if (head == null) {
            System.out.println("No element to delete");
        } else {
            head = head.getNext();
        }
    }

    // prints linked list
    public void printLinkedList() {
        System.out.println("My nodes : " + head);
    }

}
