package Queue;

public class QueueArrayImp {
	
	int capacity;
	int queueArr[];
	int front;
	int rear;
	int currentSize;
	
	public QueueArrayImp(int sizeofQueue) {
		this.capacity=sizeofQueue;
		front=0;
		rear=-1;
		queueArr = new int[this.capacity];
	}
	
	/**
	 * This method is used to add element in the queue
	 * @param data
	 */
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("Queue is already full, cannot insert data");
		}
		else {
			rear++;
			if(rear == capacity-1) {
				rear=0;
			}
			
			queueArr[rear] = data;
			currentSize++;
			System.out.println(data + " added to the quque");
		}
		
	}
	
	/**
	 * This method used to remove the element from the front of the queue:
	 */
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Hey, queue is empty and cannot delete the element");
		}
		else {
			front++;
			if(front == capacity-1) { 
				System.out.println(queueArr[front-1] +" remved from the queue");
				front =0;
			}else {
				System.out.println(queueArr[front-1] +" remved from the queue");
				
			}
			currentSize--;
		}
	}
	
	
	
	public boolean isFull() {
		if(currentSize==capacity) {
			return true;
		}
		
		return false;
	}
	
	public boolean isEmpty() {
		if(currentSize==0) {
			return true;
		}
		
		return false;
	}
	
	
	

	public static void main(String[] args) {
		QueueArrayImp obj = new QueueArrayImp(10);
		
		obj.enqueue(10);
		obj.enqueue(20);
		obj.dequeue();
		
		obj.enqueue(30);
		obj.enqueue(40);
		obj.enqueue(50);
		obj.enqueue(60);
		obj.enqueue(100);
		obj.enqueue(200);
		
		obj.dequeue();
		

	}

}
