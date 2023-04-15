public class Main {
    public static void main(String[] args) {

        DoubleLinkedListManager manager = new DoubleLinkedListManager();

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        manager.addFirst(n3);
        manager.addLast(n5);
        manager.addNode(n4, n3, n5);
        manager.addFirst(n1);
        manager.addNode(n2, n1, n3);

        Node node = manager.getFirst();
        while(node != manager.getTail()){
            System.out.println(node.getItem());
            node = node.getNext();
        }
    }
}
