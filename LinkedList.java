/**
 * Ability to create Linked List by appending 30 and 70 to 56
 * - Node with data 56 is First Created
 * - Next Append 30 to 56
 * - Finally Append 70 to 30
 * - LinkedList Sequence: 56->30->70
 *
 * @author Krunal Lad
 * @Since 22-06-2021
 */
public class LinkedList {
    static LinkedList linkedList = new LinkedList();

    private INode head;
    private INode tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        linkedList.createLinkedList();
        linkedList.printLinkedList();
    }

    // creates linked list
    public void createLinkedList() {
        Node<Integer> myFirstNode = new Node<Integer>(56);
        Node<Integer> mySecondNode = new Node<Integer>(30);
        Node<Integer> myThirdNode = new Node<Integer>(70);
        linkedList.append(myFirstNode);
        linkedList.append(mySecondNode);
        linkedList.append(myThirdNode);
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
    private void append(INode newNode){
        // checks if linked list is empty then head and tail points to first node
        if(head == null)
            head = newNode;
        if(tail == null)
            tail = newNode;
        else {
            //temporary node will initially store tail value,
            // then new node will become tail nad temporary node next will point to new node
            INode tempNode = tail;
            tail = newNode;
            tempNode.setNext(newNode);
        }
    }

    // prints linked list
    public void printLinkedList() {
        System.out.println("My nodes : " + head);
    }

}
