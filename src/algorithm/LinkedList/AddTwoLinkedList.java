package algorithm.LinkedList;

public class AddTwoLinkedList {
	
	public static void main(String args[])
	{

		ListNode Node11 = new ListNode(5);
		ListNode Node12 = new ListNode(9);
		//ListNode Node13 = new ListNode(3);
		//ListNode Node14 = new ListNode(0);
		
		ListNode Node21 = new ListNode(5);
		//ListNode Node22 = new ListNode(6);
		//ListNode Node23 = new ListNode(4);
		//ListNode Node24 = new ListNode(0);
		
		Node11.next = Node12;
		//Node12.next = Node13;
		//Node13.next = Node14;
		
		//Node21.next = Node22;
		//Node22.next = Node23;
	//	Node23.next = Node24;
		
		ListNode l1 = addTwoNumbers(Node11,Node21);
		
		System.out.println(l1.val + " --> "+l1.next.val);

	}
	
	
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int carry = 0;
		ListNode p1 = l1, p2 = l2;
		while ((p1 != null) || (p2 != null)) {
			p1.val = p1.val + p2.val + carry;
			carry = p1.val / 10;
			
			if (carry > 0) {
				p1.val = (p1.val) % 10;
			}
			
			
			
			if((p1.next == null && p2.next != null))
			{
				ListNode lastNode = new ListNode(0);
				p1.next = lastNode;
			}
			
			if((p1.next != null && p2.next == null))
			{
				ListNode lastNode = new ListNode(0);
				p2.next = lastNode;
			}
			
			if((p1.next == null && p2.next == null) && carry>0)
			{
				ListNode lastNode = new ListNode(carry);
				p1.next = lastNode;
				break;
			}
			
			p1 = p1.next;
			p2 = p2.next;

		}
		
		return l1;
	}
	
	
	
	

}
