package whildhogs;


import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<Integer, Integer> f = x -> x * 2;
        Solution.map(new Node(1, new Node(2, new Node(3))), f);
//        Node<T> score5 = new Node(1, new Node(2, new Node(3)));

//        System.out.println(Solution.reduce(new Node(1, new Node(2, new Node(3))), (a, b) -> a + b, 0));
    }
}
class Solution {
        static <T, R> Node<R> map(Node<T> head, Function<T, R> f) {
        if (head == null){
            return null;
        }
        Node<T> counter = head;
        Node<R> result = new Node<>(f.apply(counter.data));
        Node<R> last = result;
        counter = counter.next;

        while (counter != null) {
            Node<R> newNode = new Node<>(f.apply(counter.data));
            last.next = newNode;
            last = newNode;
            counter = counter.next;
        }

        Node<R> iterator = result;
        while (iterator != null) {
            System.out.println(iterator.data);
            iterator = iterator.next;
        }
        return result;
    }
    static <T> T reduce(Node<T> head, BiFunction<T, T, T> f, T init) {

        if (head == null){
            return init;
        }
        Node<T> counter = head;
        Node<T> score = new Node<T>(null);
        while (counter != null){
            score.data = f.apply(init, counter.data);
            counter = counter.next;
            System.out.println(score.data);
            init = score.data;
        }
        return score.data;
    }
}


class Node<T> {
    public T data;
    public Node<T> next;

    Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(T data) {
        this(data, null);
    }
}