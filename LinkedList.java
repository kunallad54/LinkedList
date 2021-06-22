import java.util.Scanner;

/**
 * Ability to insert 40 after 30 to the Linked List sequence of 56->30->70
 * - Search LinkedList to get Node with key value 30
 * - Then Insert 40 to 30
 * - Final Sequence: 56->30->40->70
 *
 * Here it can insert,create,and can delete first and last element of linked list,can search elements in
 * linked list
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
                    linkedList.popLast();
                    break;
                case 5:
                    System.out.println("Enter the element you want to search : ");
                    element = scanner.nextInt();
                    boolean flag1 = linkedList.searchElement(element);
                    if(flag1 == false)
                        System.out.println(element+" is not present in the list");
                    break;
                case 6:
                    linkedList.printLinkedList();
                    break;
                case 7:
                    flag = false;
                    break;
            }
        }
        int size = linkedList.size();
        System.out.println("Size of linked list is : "+size);
    }

    // user console
    public int userConsole() {
        System.out.println("Press 1 to create Linked List");
        System.out.println("Press 2 to insert element in  Linked List");
        System.out.println("Press 3 to delete FIRST element of Linked List");
        System.out.println("Press 4 to delete LAST element of Linked List");
        System.out.println("Press 5 to search element in Linked List");
        System.out.println("Press 6 to display Linked List");
        System.out.println("Press 7 to EXIT ");

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
            size ++;
        }
    }

    // deleting first element of linked list
    public void popFirst() {
        if (head == null) {
            System.out.println("No element to delete");
        } else {
            head = head.getNext();
            size --;
        }
    }

    // deleting last element of linked list
    private void popLast() {
        if (head == null) {
            System.out.println("No element to delete");
        } else {
            INode currentNode =  head;
            while (currentNode.getNext().getNext() != null){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(null);
            size --;
        }
    }
    
    // searches the element by traversing the linked list
    public boolean searchElement(Integer element){
        if(head == null)
            System.out.println("Linked List is empty");
        else{
            INode currentNode = head;
            int position = 0;
            while (currentNode != null){
                position++;
                if(currentNode.getKey() == element){
                    System.out.println(element+" is present at position "+position+" in list");
                    return true;
                }
                currentNode = currentNode.getNext();
            }
        }
        return false;
    }

    // prints linked list
    public void printLinkedList() {
        System.out.println("My nodes : " + head);
    }

}
