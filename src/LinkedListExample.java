import java.util.Scanner;

class LinkedListNode {

	int value;
	LinkedListNode next;
	int size=0;
	public LinkedListNode(LinkedListNode lstNode, int value) {
		this.value = value;
		this.next = lstNode;
		size++;
		
	}

}

public class LinkedListExample {

	private static int size;

	public static void main(String args[]) {

		LinkedListNode Node1 = new LinkedListNode(null, 10);
		LinkedListNode Node5 = new LinkedListNode(Node1, 50);
		LinkedListNode Node4 = new LinkedListNode(Node5, 40);
		LinkedListNode Node3 = new LinkedListNode(Node4, 30);
		LinkedListNode Node2 = new LinkedListNode(Node3, 20);
		Node1.next = Node2;
		
		size = Node2.size;
		
		// Node1 = new LinkedListNode(Node2, 10);

		System.out.println("List Before insertion :: "+Node2.value + " --> " + Node2.next.value + " --> "
				+ Node2.next.next.value + " --> " + Node2.next.next.next.value
				+ " --> " + Node2.next.next.next.next.value + " --> "
				+ Node2.next.next.next.next.next.value);
		
		Scanner scanner = new Scanner(System.in);
		int numberNeedToBeInsert = scanner.nextInt();
		LinkedListNode nodeToBeInsert = new LinkedListNode(null, numberNeedToBeInsert);
		LinkedListNode ptr = Node2;
		for(int i=0;i<size; i++) 
		{
			if((ptr.next != null) && (ptr.value < numberNeedToBeInsert && ptr.next.value > numberNeedToBeInsert))
			{
				LinkedListNode temp = ptr.next;
				ptr.next = nodeToBeInsert;
				nodeToBeInsert.next = temp;
				break;
			}
			
			ptr = ptr.next;
			
		}
		
		System.out.println("List After insertion :: "+Node2.value + " --> " + Node2.next.value + " --> "
				+ Node2.next.next.value + " --> " + Node2.next.next.next.value
				+ " --> " + Node2.next.next.next.next.value + " --> "
				+ Node2.next.next.next.next.next.value);
		
		
		

	}

}
