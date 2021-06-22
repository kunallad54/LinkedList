import java.util.Scanner;

/**
 * Ability to dequeue from the beginning
 * -Use LinkedList to do the Queue Operations
 * here it performs enqueue and dequeue operations
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

    // performing dequeue as First in gets First Out
    public void dequeueElement(){
        linkedList.popFirst();
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
                    queue.dequeueElement();
                    System.out.println("Dequeue Operation successfully performed !!! ");
                    break;
                case 3:
                    queue.printQueue();
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }
    }

    // view
    public int userConsole() {
        System.out.println("Press 1 - to perform Enqueue Operation");
        System.out.println("Press 2 - to perform Dequeue Operation");
        System.out.println("Press 3 - to Display queue elements");
        System.out.println("Press 4 - to EXIT ");

        return scanner.nextInt();
    }
}
