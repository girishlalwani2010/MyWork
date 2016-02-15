package algorithm.LinkedList;

public class CircularLinkedList {


    protected LinkedListNode start ;
    protected LinkedListNode end ;
    public int size ;
 
    /* Constructor */
    public CircularLinkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
    /* Function to check if list is empty */
    public boolean isEmpty()
    {
        return start == null;
    }
    /* Function to get size of the list */
    public int getSize()
    {
        return size;
    }
    /* Function to insert element at the begining */
    public void insertAtStart(int val)
    {
        LinkedListNode nptr = new LinkedListNode(null,val);    
        nptr.setNext(start);
        if(start == null)
        {            
            start = nptr;
            nptr.setNext(start);
            end = start;            
        }
        else
        {
            end.setNext(nptr);
            start = nptr;        
        }
        size++ ;
    }
    /* Function to insert element at end */
    public void insertAtEnd(int val)
    {
        LinkedListNode nptr = new LinkedListNode(null,val);    
        nptr.setNext(start);
        if(start == null)
        {            
            start = nptr;
            nptr.setNext(start);
            end = start;            
        }
        else
        {
            end.setNext(nptr);
            end = nptr;            
        }
        size++ ;
    }
    /* Function to insert element at position */
    public void insertAtPos(int val , int pos) 
    {
        LinkedListNode nptr = new LinkedListNode(null,val);                
        LinkedListNode ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos) 
            {
                LinkedListNode tmp = ptr.getNext() ;
                ptr.setNext( nptr );
                nptr.setNext(tmp);
                break;
            }
            ptr = ptr.getNext();
        }
        size++ ;
    }
    
    /* Function to display contents */
    public void display()
    {
        System.out.print("\nCircular Singly Linked List = ");
        LinkedListNode ptr = start;
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getNext() == start) 
        {
            System.out.print(start.getValue()+ "->"+ptr.getValue()+ "\n");
            return;
        }
        System.out.print(start.getValue()+ "->");
        ptr = start.getNext();
        while (ptr.getNext() != start) 
        {
            System.out.print(ptr.getValue()+ "->");
            ptr = ptr.getNext();
        }
        System.out.print(ptr.getValue()+ "->");
        ptr = ptr.getNext();
        System.out.print(ptr.getValue()+ "\n");
    }
}
