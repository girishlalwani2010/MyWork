package algorithm.LinkedList;

public class OddEvenList {

	public static void main(String args[])
	{
		ListNode Node11 = new ListNode(1);
		ListNode Node12 = new ListNode(2);
		ListNode Node13 = new ListNode(3);
		ListNode Node14 = new ListNode(4);
		
	
		
		Node11.next = Node12;
		Node12.next = Node13;
		Node13.next = Node14;
		
		
	ListNode l1 = 	oddEvenList(Node11);
	
	while(l1!=null)
	{
		System.out.println(l1.val);
		l1=l1.next;
	}

	
	
	}

	public static ListNode oddEvenList(ListNode head) {
	    if(head == null || head.next == null){
	        return head;
	    }
	    ListNode odd = head;
	    ListNode even = head.next;
	    ListNode even_head = head.next;
	    while(even != null && even.next != null){
	        odd.next = odd.next.next;
	        even.next = even.next.next;
	        odd = odd.next;
	        even = even.next;
	    }
	    odd.next = even_head;
	    return head;
	}
	
}
