public class LinkedList {


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        if(linkedList.createLinkedList())
            System.out.println("Linked list Successfully created");
        else
            System.out.println("Linked list not created");
    }

    public boolean createLinkedList() {
        Node<Integer> myFirstNode = new Node<Integer>(56);
        Node<Integer> mySecondNode = new Node<Integer>(30);
        Node<Integer> myThirdNode = new Node<Integer>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);

        if(myFirstNode.getNext() == mySecondNode && mySecondNode.getNext() == myThirdNode){
            return true;
        }
        return false;
    }

}
