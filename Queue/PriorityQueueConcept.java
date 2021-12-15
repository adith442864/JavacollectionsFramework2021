package Queue;

import java.util.PriorityQueue;

public class PriorityQueueConcept {

	public static void main(String[] args) {
		
		//least element will be taken first from the priority queue
		// greatest(Rear),  least(Front)
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(750);
		pq.add(900);
		pq.add(500);
		pq.add(100);
		pq.add(50);
		
		System.out.println(pq.size());
		System.out.println(pq.poll());
		
		
		System.out.println(pq.remove(50));

	}

}
