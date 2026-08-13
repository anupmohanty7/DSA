class Node{
	int ele;
	Node next;
	Node(int ele,Node next)
	{
		this.ele=ele;
		this.next=next;
	}
	Node(int ele)
	{
		this.ele=ele;
		this.next=null;
	}
}
class insertathead{
	public Node inserthead(Node head,int newele)
	{
	Node newhead=new Node(newele,head);
	return newhead;
	}
	public void printlist(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.ele+"");
			temp=temp.next;
		}
		System.out.println();
	}
}
class driver{
	
	public static void main(String arg[]){
		Node head=new Node(10);
		head.next=new Node(20);
		insertathead sl=new insertathead();
		head=sl.inserthead(head,5);
		System.out.println("After insertion the list is :");
		sl.printlist(head);
		
	}
}