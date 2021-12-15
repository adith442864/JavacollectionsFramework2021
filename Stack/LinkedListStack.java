package Stack;

public class LinkedListStack {
	
	Node head;
	
	class Node{
		int value;
		Node next;
	}
	
	
	public LinkedListStack() {
		head=null;
	
	}
	
	//push: add value to the beginning of the list:
	public void push(int value) {
		Node extrahead = head;
		head = new Node();
		head.value=value;
		head.next=extrahead;
	}
	
	public int pop() {
		
		if(head==null) {
			System.out.println("stack is empty..");
		}
		
		int value=head.value;
		head = head.next;
		return value;
	}
	
	//print all values:
	public static void printList(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.value +" ");
			temp=temp.next;
		}
	}
	


	public static void main(String[] args) {
		
		LinkedListStack lls = new LinkedListStack();
		
//		System.out.println(lls.pop());
		
		lls.push(10);
		lls.push(20);
		lls.push(30);
		lls.push(60);
		lls.push(90);
		
		System.out.println("element removed or popped froms tack :"+lls.pop());
		System.out.println("element removed or popped froms tack :"+lls.pop());
		
		lls.push(45);
		System.out.println("element removed or popped froms tack :"+lls.pop());
		
		printList(lls.head);
		

	}

}
