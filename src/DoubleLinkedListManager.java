public class DoubleLinkedListManager {

    private Node head;

    private Node tail;

    public DoubleLinkedListManager(){
        head = new Node(0); // 헤드노드의 item영역을 LinkedList의 size라고 하자.
        tail = new Node(0);
        head.setNext(tail);
        tail.setPrev(head);
    }

    public Node getHead(){ return head; }
    public Node getTail(){ return tail; }
    public Node getFirst(){return head.getNext(); }
    public Node getLast(){ return tail.getPrev(); }

    public void addFirst(Node new_node){
        new_node.setPrev(head);
        new_node.setNext(head.getNext());
        head.getNext().setPrev(new_node);
        head.setNext(new_node);

        head.setItem(head.getItem()+1);
    }

    public void addLast(Node new_node){
        new_node.setNext(tail);
        new_node.setPrev(tail.getPrev());
        tail.getPrev().setNext(new_node);
        tail.setPrev(new_node);

        head.setItem(head.getItem()+1);
    }

    public void addNode(Node new_node, Node prev_node, Node next_node){
        new_node.setNext(next_node);
        new_node.setPrev(prev_node);
        prev_node.setNext(new_node);
        next_node.setPrev(new_node);

        head.setItem(head.getItem()+1);
    }

    public void removeNode(Node remove_node){
        remove_node.getNext().setPrev(remove_node.getPrev());
        remove_node.getPrev().setNext(remove_node.getNext());

        head.setItem(head.getItem()-1);
    }

    public int getSize(){ return head.getItem(); }
}
