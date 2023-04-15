public class Node {

    private Node prev;
    private Node next;
    private int item;

    public Node(int item){
        this.item = item;
        prev = null;
        next = null;
    }

    public void setItem(int item){
        this.item = item;
    }

    public int getItem(){
        return item;
    }

    public void setPrev(Node prev){
        this.prev = prev;
    }

    public Node getPrev(){
        return prev;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return next;
    }
}
