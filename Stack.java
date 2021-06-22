import java.util.Scanner;

/**
 * Ability to peak and pop from the Stack till it is empty 56->30->70
 * - Use LinkedList to do the Stack Operations
 * Here Stack can perform Push,pop,peak operations 
 *
 * @author Krunal Lad
 * @Since 22-06-2021
 */

//@param <K>
public class Stack<K> {
    private final LinkedList linkedList;
    static Scanner scanner = new Scanner(System.in);

    public Stack() {
        linkedList = new LinkedList();
    }

    // pushing elements  at top of stack
    public void push(Integer element) {
        Node<Integer> newNode = new Node<Integer>(element);
        linkedList.add(newNode);
    }

    //peak method returns top of stack
    public void peak(){
        Integer head = (Integer) linkedList.head();
        System.out.println(head);
    }

    // deletes top element of stack
    public void pop(){
        linkedList.popFirst();
    }

    // printing stack values
    public void printStack() {
        linkedList.printLinkedList();
    }

    // main method
    public static void main(String[] args) {
        Stack stack = new Stack();

        boolean flag = true;
        while (flag) {
            int choice = stack.userConsole();
            switch (choice){
                case 1:
                    System.out.println("Enter the elements that you want to push in Stack : ");
                    Integer element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    stack.peak();
                    //System.out.println("Element at the top of stack is : "+peak);
                    break;
                case 3:
                    stack.pop();
                    System.out.println("Successfully removed top element of stack !!!");
                    break;
                case 4:
                    stack.printStack();
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
    }

    public int userConsole(){
        System.out.println("Press 1 - to Push in stack");
        System.out.println("Press 2 - to Peak in stack");
        System.out.println("Press 3 - to Pop in stack");
        System.out.println("Press 4 - to Display stack elements");
        System.out.println("Press 5 - to EXIT ");

        return scanner.nextInt();
    }
}
