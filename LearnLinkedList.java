import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedlListQueue {
	
	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(10);
		q.offer(8);
		q.offer(12);
		System.out.println(q);
		System.out.println(q.offer(100));
		System.out.println(q.poll());
		System.out.println(q.peek());
		
		q.remove();
	}
}
