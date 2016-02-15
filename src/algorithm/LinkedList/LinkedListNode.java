package algorithm.LinkedList;
public class LinkedListNode{
	
	int value;
	LinkedListNode next;
	
	public LinkedListNode(LinkedListNode lstNode,int value)
	{
		this.value = value;
		this.next = lstNode;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public LinkedListNode getNext() {
		return next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}
	
}
