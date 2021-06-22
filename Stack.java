import java.util.Scanner;

/**
 * Ability to create a Stack of 56->30->70
 * - Use LinkedList to do the Stack Operations
 * - Here push will internally call add method on LinkedList.
 * - So 70 will be added first then 30 and then 56 to make 56 on top of the Stack
 *
 * @author Krunal Lad
 * @Since 22-06-2021
 */

//@param <K>
public class Stack<K> {
    private final LinkedList linkedList;

    public Stack() {
        linkedList = new LinkedList();
    }

    // pushing elements  at top of stack
    public void push(Integer element) {
        Node<Integer> newNode = new Node<Integer>(element);
        linkedList.add(newNode);
    }

    // printing stack values
    public void printStack() {
        linkedList.printLinkedList();
    }

    // main method
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the elements that you want to push in Stack : ");
            Integer element = scanner.nextInt();
            stack.push(element);
            System.out.println("Press 0 to exit to continue press any key ");
            int userChoice = scanner.nextInt();
            if (userChoice == 0)
                flag = false;
        }
        stack.printStack();
    }
}
