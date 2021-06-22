public class Node<K> implements INode<K>{
    private K key;
    private INode next;

    public Node() {
    }

    public Node(K key) {
        this.key = key;
        this.next = null;
    }

    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    public INode<K> getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("MyNode{" + "key=").append(key).append('}');
        if(next != null)
            nodeString.append("->").append(next);
        return nodeString.toString();
    }
}
