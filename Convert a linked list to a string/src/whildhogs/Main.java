package whildhogs;

public class Main {

    public static void main(String[] args) {

        Node myList = new Node(1, new Node(2, new Node(3)));
        System.out.println(stringify(myList));

    }
    public static String stringify(Node list) {
        String score = "";
        while (list != null){
            score += list.getData() + " -> ";
            list = list.getNext();
        }
        score += "null";
        return score;
    }
}

class Node {
    private int data;
    private Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}