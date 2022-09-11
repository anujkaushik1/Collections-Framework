import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
	
	public static void main(String[] args) {
		
		// Min Heap
		Queue<Integer> pq = new PriorityQueue<>();
		pq.offer(12);
		pq.offer(24);
		pq.offer(8);
		pq.offer(10);
		
		System.out.println(pq);
		
		pq.poll();
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
		// Max Heap
		
		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.offer(12);
		pq.offer(24);
		pq.offer(8);
		pq.offer(10);
		
		System.out.println(pq);
	}

}
