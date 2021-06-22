import java.util.Scanner;

/**
 * Ability to create a Queue of 56->30->70
 * - Use LinkedList to do the Queue Operations
 * - Here enqueue will internally call append method on LinkedList.
 * - So 56 will be added first then 30 and then 70 to make 56 on top of the Stack
 *
 * @author Krunal Lad
 * @Since 22-06-2021
 */
//@param <K>
public class Queue<K> {
    private final LinkedList linkedList;
    static Scanner scanner = new Scanner(System.in);

    public Queue() {
        linkedList = new LinkedList();
    }

    // inserting elements in FIFO format
    public void enqueueElements(Integer element) {
        Node<Integer> newNode = new Node<Integer>(element);
        linkedList.append(newNode);
    }

    // printing queue elements
    public void printQueue() {
        linkedList.printLinkedList();
    }

    // main method
    public static void main(String[] args) {
        Queue queue = new Queue();
        boolean flag= true;
        while (flag){
            int choice = queue.userConsole();
            switch (choice){
                case 1:
                    System.out.println("Enter the element you want to insert in queue");
                    Integer element = scanner.nextInt();
                    queue.enqueueElements(element);
                    break;
                case 2:
                    queue.printQueue();
                    break;
                case 3:
                    flag = false;
                    break;
            }
        }
    }

    // view
    public int userConsole() {
        System.out.println("Press 1 - to insert elements in Queue");
        System.out.println("Press 2 - to Display queue elements");
        System.out.println("Press 3 - to EXIT ");

        return scanner.nextInt();
    }
}
