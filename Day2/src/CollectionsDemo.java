import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class CollectionsDemo {
    public static void main(String[] args) {
//        Stack<Integer> stack  = new Stack<>();
//
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//
//        stack.peek();
//
//        stack.pop();
//
//        System.out.println(stack);

        Queue<Integer> q = new LinkedList<>();
        q.peek();

        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(40);
        pq.offer(30);
        pq.offer(5);
        pq.offer(50);

//        pq.poll();

        System.out.println(pq);

    }
}
